package com.example.service;

import com.example.domain.Personnel;

public interface PersonnelService {

    /**
     * 员工登录的方法
     * @param personnel
     * @return
     */
    public Personnel login(Personnel personnel);

    /**
     * 员工注册的方法
     * @param personnel
     * @return
     */
    public boolean register(Personnel personnel);

    /**
     * 异步判断员工名是否存在
     * @param pername
     * @return
     */
    public boolean judgePersonnel(String pername);

    /**
     * 修改员工信息的方法
     * @param personnel
     * @return
     */
    public boolean modifyPername(Personnel personnel);
}
