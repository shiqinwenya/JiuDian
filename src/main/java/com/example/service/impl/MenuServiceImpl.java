package com.example.service.impl;

import com.example.dao.MenuDao;
import com.example.domain.Menu;
import com.example.domain.Roominfo;
import com.example.dto.MenuDto;
import com.example.service.MenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public PageInfo<Menu> findMenuAll(MenuDto menuDto) {
        //创建Example对象
        Example example = new Example(Menu.class);
        //设置查询条件
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("menustate", 1);
        if (menuDto.getMname() != null) {
            criteria.andLike("mname", "%"+menuDto.getMname()+"%");
        }
        PageHelper.startPage(menuDto.getPage(), menuDto.getPageSize());
        //排序
        example.setOrderByClause("mid asc");
        List<Menu> list = this.menuDao.selectByExample(example);
        PageInfo<Menu> pageInfo = new PageInfo<Menu>(list);
        return pageInfo;
    }

    @Override
    public boolean delMenuByKey(Integer mid) {
        int num = this.menuDao.deleteByPrimaryKey(mid);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyMenu(Menu menu) {
        int num = this.menuDao.updateByPrimaryKey(menu);
        if(num>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addMenu(Menu menu) {
        int num = this.menuDao.insert(menu);
        if(num>0){
            return true;
        }
        return false;
    }
}
