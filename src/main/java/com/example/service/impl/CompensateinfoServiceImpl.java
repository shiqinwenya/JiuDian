package com.example.service.impl;

import com.example.dao.CompensateinfoDao;
import com.example.service.CompensateinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensateinfoServiceImpl implements CompensateinfoService {

    @Autowired
    private CompensateinfoDao compensateinfoDao;

}
