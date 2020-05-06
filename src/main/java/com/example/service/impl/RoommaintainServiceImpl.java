package com.example.service.impl;

import com.example.dao.RoommaintainDao;
import com.example.service.RoommaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoommaintainServiceImpl implements RoommaintainService {

    @Autowired
    private RoommaintainDao roommaintainDao;
}
