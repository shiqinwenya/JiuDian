package com.example.service.impl;

import com.example.dao.OrdersinfoDao;
import com.example.service.OrdersinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersinfoServiceImpl implements OrdersinfoService {

    @Autowired
    private OrdersinfoDao ordersinfoDao;
}
