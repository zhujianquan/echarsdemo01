package com.example.service;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName AllService
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/04/24 14:12
 */
public interface AllService {
    public List<HashMap<String,Object>> test();

    HashMap<String, Object> getUserCount();
}
