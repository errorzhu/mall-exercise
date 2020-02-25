package com.errorzhu.mall.common;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;


public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    public CommonPage() {
    }

    public CommonPage(Integer pageNum, Integer pageSize, Integer totalPage, Long total, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.total = total;
        this.list = list;
    }

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(List<T> list) {

        PageInfo<T> pageInfo = new PageInfo<T>(list);
        CommonPage<T> result = new CommonPage<T>(pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getPages(),pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(Page<T> pageInfo) {
        CommonPage<T> result = new CommonPage<T>(pageInfo.getNumber(),pageInfo.getSize(),pageInfo.getTotalPages(),pageInfo.getTotalElements(),pageInfo.getContent());
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
