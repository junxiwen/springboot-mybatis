package com.hyanzz.form.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

/**
 * Created by Administrator on 2018/12/11.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Alias("userInfoForm")
public class UserInfoForm extends MyRequestForm {
    private Integer gender;
}
