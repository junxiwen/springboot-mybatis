package com.hyanzz.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyanzz.form.request.MyRequestForm;
import com.hyanzz.form.request.UserInfoForm;
import com.hyanzz.mapper.UserMapper;
import com.hyanzz.form.PageBean;
import com.hyanzz.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/12/11.
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageBean findAllUser(UserInfoForm queryForm) {
        //1. 初始化分页参数
        queryForm.initPageNumAndSize();
        //2. 因为PageHelper的作用，这里就会返回当前分页的集合了
        List<UserInfo> userInfoList = userMapper.findAllUser();
        //3. 根据返回的集合，创建PageBean对象
        return PageBean.initPageBean(userInfoList);
    }

    @Override
    public void insert(UserInfo userInfo){
        userMapper.insert(userInfo);
    }

    @Override
    public PageBean findByGender(UserInfoForm queryForm) {
        //1. 初始化分页参数
        queryForm.initPageNumAndSize();
        //2. 因为PageHelper的作用，这里就会返回当前分页的集合了
        List<UserInfo> userInfoList = userMapper.findByGender(queryForm);
        //3. 根据返回的集合，创建PageBean对象
        return PageBean.initPageBean(userInfoList);
    }
}
