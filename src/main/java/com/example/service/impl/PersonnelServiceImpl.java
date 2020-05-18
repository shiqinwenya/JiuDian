package com.example.service.impl;

import com.example.dao.PersonnelDao;
import com.example.domain.Personnel;
import com.example.domain.Userinfo;
import com.example.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    @Autowired
    private PersonnelDao personnelDao;


    @Override
    public Personnel login(Personnel personnel) {
        Example example = new Example(Personnel.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("pername", personnel.getPername());
        Personnel pp = this.personnelDao.selectOneByExample(example);
        if(pp == null){
            return null;
        }
        if (!(personnel.getPerpwd().equals(pp.getPerpwd()))){
            return null;
        }
        return pp;
    }

    @Override
    public boolean register(Personnel personnel) {
        int num = personnelDao.insert(personnel);
        if (num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean judgePersonnel(String pername) {
        Example example = new Example(Userinfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("pername", pername);
        Personnel pp = this.personnelDao.selectOneByExample(example);
        if(pp != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyPername(Personnel personnel) {
        int num = personnelDao.updateByPrimaryKey(personnel);
        if (num>0){
            return true;
        }
        return false;
    }
}
