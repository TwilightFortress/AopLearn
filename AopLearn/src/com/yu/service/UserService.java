package com.yu.service;

import com.yu.bean.UserEntry;

/**
 * @author yuyang
 * @create 2019-05-29 14:32
 */
public interface UserService {

    public String addUser(UserEntry userEntry);

    public void delUser(String userId);
}
