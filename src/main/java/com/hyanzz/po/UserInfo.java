package com.hyanzz.po;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by Administrator on 2018/12/11.
 */
@Data
@Alias("UserInfo")
public class UserInfo {
    private Integer id;
    private String userName;
    private String address;
    private Integer gender;
}
