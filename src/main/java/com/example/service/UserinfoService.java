package com.example.service;

import com.example.domain.Userinfo;

public interface UserinfoService {

    /**
     * 用户登录的方法
     * @param userinfo
     * @return
     */
    public Userinfo login(Userinfo userinfo);

    /**
     * 用户注册的方法
      * @param userinfo
     * @return
     */
    public boolean register(Userinfo userinfo);

    /**
     * 异步判断用户名是否存在
     * @param username
     * @return
     */
    public boolean judgeName(String username);

    /**
     * 修改用户信息的方法
     * @param userinfo
     * @return
     */
    public boolean modifyUser(Userinfo userinfo);
}
