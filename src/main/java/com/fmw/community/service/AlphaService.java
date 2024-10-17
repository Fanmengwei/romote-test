package com.fmw.community.service;

import com.fmw.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
//        System.out.println("实例化AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }

}
