package com.example.dto;

public class PageDto {
    private int page = 1; //当前显示页数
    private int pageSize = 3; //每页的显示数

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public PageDto() {
        // TODO Auto-generated constructor stub
    }
}
