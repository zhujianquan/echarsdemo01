package com.example.service.impl;

import com.example.dao.AllDao;
import com.example.service.AllService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName AllServiceImpl
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/04/24 14:14
 */

@Service("allService")
public class AllServiceImpl implements AllService {

    @Resource
    private AllDao allDao ;

    @Override
    public List<HashMap<String,Object>> test() {
        return allDao.selectAllUser();
    }

    @Override
    public HashMap<String, Object> getUserCount() {
        int count = allDao.getUserCount();
        HashMap<String, Object> map= new HashMap<String, Object>();
        map.put("count",count);
        return map;
    }
}
