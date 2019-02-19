package com.rong.blog.pojo;

import java.util.List;

public class Pager<T> {

    private int pageNumber = 1;
    private int pageSize = 10;
    private int total;
    private int totalPage;
    private int start;
    private List<T> list;

    public Pager() {
        super();
    }

    public Pager(int pageNumber, int pageSize, int total) {
        super();
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.total = total;
        this.totalPage = (this.total + this.pageSize - 1) / this.pageSize;
        this.start = (this.pageNumber - 1) * this.pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getStart() {
        return start;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
