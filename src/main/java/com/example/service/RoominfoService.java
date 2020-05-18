package com.example.service;

import com.example.domain.Roominfo;
import com.example.dto.RoominfoDto;
import com.github.pagehelper.PageInfo;

public interface RoominfoService {

    /**
     * 带条件分页查询
     * @param roominfoDto
     * @return
     */
    public PageInfo<Roominfo> findRoominfoAll(RoominfoDto roominfoDto);

    /**
     * 根据客房id修改客房状态
     * @param roomid
     * @param type
     * @return
     */
    public boolean modifyRoominfo(Integer roomid, Integer type);

    /**
     * 根据客房id修改客房入住情况
     * @param roomid
     * @param caninfo
     * @return
     */
    public boolean modifyCaninfo(Integer roomid, String caninfo);

    /*crud*/

    /**
     * 添加客房记录的方法
     * @param roominfo
     * @return
     */
    public boolean addRoominfo(Roominfo roominfo);

    /**
     * 删除客房记录的方法
     * @param roomid
     * @return
     */
    public boolean delRoominfo(Integer roomid);
}
