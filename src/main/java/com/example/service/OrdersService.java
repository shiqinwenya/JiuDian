package com.example.service;

import com.example.domain.Orders;
import com.example.dto.PageDto;
import com.github.pagehelper.PageInfo;

public interface OrdersService {

    /**
     * 分页查询所有订单记录
     * @param pageDto
     * @return
     */
    public PageInfo<Orders> findOrdersAll(PageDto pageDto);


    /**
     * 根据key删除订单记录
     * @param orderid
     * @return
     */
    public boolean delOrdersBykey(Integer orderid);

    /**
     * 添加一条订单记录
     * @param orders
     * @return
     */
    public boolean addOneOrders(Orders orders);

    /**
     * 修改订单记录的方法
     * @param orders
     * @return
     */
    public boolean modifyOrders(Orders orders);
}
