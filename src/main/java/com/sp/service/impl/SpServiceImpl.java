package com.sp.service.impl;

import com.sp.dao.SpDao;
import com.sp.pojo.Bplan;
import com.sp.service.SpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author ZhPJ
 * @Date 2019/7/15 001510:09
 * @Version 1.0
 * @Description:
 */
@Service
public class SpServiceImpl implements SpService {

    @Autowired
    private SpDao spDao;


    @Override
    public List<Bplan> selectBplans() {
        return spDao.selectBplans();
    }
}
