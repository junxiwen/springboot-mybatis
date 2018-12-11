package com.hyanzz.mapper;


import com.hyanzz.form.request.UserInfoForm;
import com.hyanzz.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/12/11.
 */
@Repository
public interface UserMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List findByGender(UserInfoForm record);

    List findAllUser();
}
