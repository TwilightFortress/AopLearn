package com.yu.service;

import com.yu.bean.UserEntry;

/**
 * @author yuyang
 * @create 2019-05-29 14:32
 */
//target类
public interface UserService {

    //jointPoint
    public String addUser(UserEntry userEntry);

    //jointPoint
    public void delUser(String userId);
}
