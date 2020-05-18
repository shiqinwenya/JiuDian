package com.example.service.impl;

import com.example.dao.RoominfoDao;
import com.example.domain.Roominfo;
import com.example.dto.RoominfoDto;
import com.example.service.RoominfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class RoominfoServiceImpl implements RoominfoService {

    @Autowired
    private RoominfoDao roominfoDao;

    @Override
    public PageInfo<Roominfo> findRoominfoAll(RoominfoDto roominfoDto) {
        //创建Example对象
        Example example = new Example(Roominfo.class);
        //设置查询条件
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roominfo", 1);
        if(roominfoDto.getRoomtype() != null){
            criteria.andLike("roomtype", "%"+roominfoDto.getRoomtype()+"%");
        }
        PageHelper.startPage(roominfoDto.getPage(), roominfoDto.getPageSize());
        //排序
        example.setOrderByClause("roomid asc");
        List<Roominfo> list = this.roominfoDao.selectByExample(example);
        PageInfo<Roominfo> pageInfo=new PageInfo<Roominfo>(list);
        return pageInfo;
    }

    @Override
    public boolean modifyRoominfo(Integer roomid, Integer type) {
        //创建Example对象
        Example example = new Example(Roominfo.class);
        //设置查询条件
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roomid", roomid);
        Roominfo rr = this.roominfoDao.selectOneByExample(example);
        rr.setRoominfo(type);
        int num = this.roominfoDao.updateByPrimaryKey(rr);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyCaninfo(Integer roomid, String caninfo) {
        //创建Example对象
        Example example = new Example(Roominfo.class);
        //设置查询条件
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roomid", roomid);
        Roominfo rr = this.roominfoDao.selectOneByExample(example);
        rr.setCaninfo(caninfo);
        int num = this.roominfoDao.updateByPrimaryKey(rr);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addRoominfo(Roominfo roominfo) {
        int num = this.roominfoDao.insert(roominfo);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delRoominfo(Integer roomid) {
        int num = this.roominfoDao.deleteByPrimaryKey(roomid);
        if(num>0){
            return true;
        }
        return false;
    }
}
