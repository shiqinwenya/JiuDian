package com.example.service.impl;

import com.example.dao.MoneyinfoDao;
import com.example.service.MoneyinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyinfoServiceImpl implements MoneyinfoService {

    @Autowired
    private MoneyinfoDao moneyinfoDao;
}
