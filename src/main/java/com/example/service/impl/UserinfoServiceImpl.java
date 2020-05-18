package com.example.service.impl;

import com.example.dao.UserinfoDao;
import com.example.domain.Userinfo;
import com.example.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserinfoServiceImpl implements UserinfoService{

    @Autowired
    private UserinfoDao userinfoDao;

    @Override
    public Userinfo login(Userinfo userinfo) {
        Example example = new Example(Userinfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", userinfo.getUsername());
        Userinfo uu = this.userinfoDao.selectOneByExample(example);
        if(uu == null){
            return null;
        }
        if (!(userinfo.getUserpwd().equals(uu.getUserpwd()))){
            return null;
        }
        return uu;
    }

    @Override
    public boolean register(Userinfo userinfo) {
        Date date = new Date();
        userinfo.setIndate(date);
        int num = userinfoDao.insert(userinfo);
        if (num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean judgeName(String username) {
        Example example = new Example(Userinfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        Userinfo uu = this.userinfoDao.selectOneByExample(example);
        if(uu != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyUser(Userinfo userinfo) {
        Example example = new Example(Userinfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", userinfo.getUsername());
        Userinfo uu = this.userinfoDao.selectOneByExample(example);
        userinfo.setIndate(uu.getIndate());
        int num = userinfoDao.updateByPrimaryKey(userinfo);
        if (num>0){
            return true;
        }
        return false;
    }
}
