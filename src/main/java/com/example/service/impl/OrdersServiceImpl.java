package com.example.service.impl;

import com.example.dao.OrdersDao;
import com.example.domain.Orders;
import com.example.dto.PageDto;
import com.example.service.OrdersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public PageInfo<Orders> findOrdersAll(PageDto pageDto) {
        //创建Example对象
        Example example = new Example(Orders.class);
        //设置查询条件
        Example.Criteria criteria = example.createCriteria();
        PageHelper.startPage(pageDto.getPage(), pageDto.getPageSize());
        //排序
        example.setOrderByClause("roomid asc");
        List<Orders> list = this.ordersDao.selectByExample(example);
        PageInfo<Orders> pageInfo=new PageInfo<Orders>(list);
        return pageInfo;
    }

    @Override
    public boolean delOrdersBykey(Integer orderid) {
        int num = this.ordersDao.deleteByPrimaryKey(orderid);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addOneOrders(Orders orders) {
        int num = this.ordersDao.insert(orders);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyOrders(Orders orders) {
        int num = this.ordersDao.updateByPrimaryKey(orders);
        if(num>0){
            return true;
        }
        return false;
    }
}
