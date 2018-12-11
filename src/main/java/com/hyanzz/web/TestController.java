package com.hyanzz.web;

import com.hyanzz.form.PageBean;
import com.hyanzz.form.request.UserInfoForm;
import com.hyanzz.po.UserInfo;
import com.hyanzz.service.IUserService;
import com.hyanzz.utils.MyStringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/12/11.
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/add")
    public String addUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(MyStringUtils.getRandomChar(4));
        userInfo.setAddress(MyStringUtils.getRandomAddress());
        userInfo.setGender(MyStringUtils.getRandomNum(1,2));
        iUserService.insert(userInfo);
        return "新增用户成功:"+userInfo.getId();
    }


    @GetMapping("/getAll")
    public PageBean<UserInfo> getUserList(){
        return iUserService.findAllUser(new UserInfoForm());
    }

    @GetMapping("/findByGender/{gender}")
    public PageBean<UserInfo> findByGender(@PathVariable("gender")Integer gender){
        UserInfoForm userInfoForm = new UserInfoForm();
        userInfoForm.setGender(gender);
        return iUserService.findByGender(userInfoForm);
    }
}
