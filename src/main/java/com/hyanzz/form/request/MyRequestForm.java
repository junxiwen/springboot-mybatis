package com.hyanzz.form.request;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyanzz.form.PageBean;
import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/11.
 */
@Data
@NoArgsConstructor // 自动生成没有参数的构造函数
@AllArgsConstructor // 自动生成全部参数的构造函数
@EqualsAndHashCode(callSuper = false)
@ToString
public class MyRequestForm implements Serializable {
    private Integer currentPage = 1; // 当前页码
    private Integer pageSize = 10;// 每页大小
    private String reqOrderName; // 排序的字段名称
    private String reqOrderType = "DESC"; // 排序方式 asc ／ desc
    private Map<String, Object> reqParam = new HashMap<>(0); //其他请求参数

    //初始化分页查询条件
    public void initPageNumAndSize(){
        PageHelper.startPage(getReqPage(),getReqPageSize());
    }

    private Integer getReqPage(){
        return (currentPage == null || currentPage < 1) ? 0 : (currentPage - 1);
    }

    private Integer getReqPageSize(){
        return (pageSize == null || pageSize < 1) ? 10 : pageSize;
    }


}
