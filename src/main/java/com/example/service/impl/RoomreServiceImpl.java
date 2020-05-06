package com.example.service.impl;

import com.example.dao.RoomreDao;
import com.example.service.RoomreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomreServiceImpl implements RoomreService {

    @Autowired
    private RoomreDao roomreDao;
}
