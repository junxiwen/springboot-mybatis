package com.hyanzz.service;


import com.hyanzz.form.PageBean;
import com.hyanzz.form.request.UserInfoForm;
import com.hyanzz.po.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/12/11.
 */
public interface IUserService {
    PageBean findAllUser(UserInfoForm queryForm);

    void insert(UserInfo userInfo);

    PageBean findByGender(UserInfoForm queryForm);
}
