package com.example.service.impl;

import com.example.dao.UsergetroomDao;
import com.example.service.UsergetroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsergetroomServiceImpl implements UsergetroomService {

    @Autowired
    private UsergetroomDao usergetroomDao;
}
