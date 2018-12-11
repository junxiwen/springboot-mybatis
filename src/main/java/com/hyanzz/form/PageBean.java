package com.hyanzz.form;
import com.github.pagehelper.PageInfo;
import com.hyanzz.form.request.MyRequestForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * Created by Administrator on 2018/12/11.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
    // 当前页
    private Integer currentPage = 1;
    // 每页显示的总条数
    private Integer pageSize = 10;
    // 总条数
    private Integer totalNum;
    // 总页数
    private Integer totalPage;
    // 分页结果
    private List<T> items;

    public static PageBean initPageBean(List list){
        //根据查询数据构建PageInfo对象
        PageInfo pageInfo = new PageInfo<>(list);
        Integer currentPage = pageInfo.getPageNum();//当前页
        Integer pageSize = pageInfo.getPageSize();//每页显示的数据
        Integer totalNum = (int)pageInfo.getTotal();//数据总数
        Integer totalPage = (totalNum+pageSize-1)/pageSize;//总页数
        return new PageBean(currentPage,pageSize,totalNum,totalPage,list);
    }
}
