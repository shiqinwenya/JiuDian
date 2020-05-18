package com.example.service;

import com.example.domain.Menu;
import com.example.dto.MenuDto;
import com.example.dto.RoominfoDto;
import com.github.pagehelper.PageInfo;

public interface MenuService {

    /**
     * 带条件分页查询所有上架的商品
     * @param menuDto
     * @return
     */
    public PageInfo<Menu> findMenuAll(MenuDto menuDto);

    /**
     * 根据mid实现物理删除
     * @param mid
     * @return
     */
    public boolean delMenuByKey(Integer mid);

    /**
     * 修改菜单商品信息
     * @param menu
     * @return
     */
    public boolean modifyMenu(Menu menu);

    /**
     * 添加菜单商品消息记录
     * @param menu
     * @return
     */
    public boolean addMenu(Menu menu);
}
