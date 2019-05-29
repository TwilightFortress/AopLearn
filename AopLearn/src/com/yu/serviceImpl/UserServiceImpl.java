package com.yu.serviceImpl;

import com.yu.bean.UserEntry;
import com.yu.service.UserService;

/**
 * @author yuyang
 * @create 2019-05-29 14:34
 */
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(UserEntry userEntry) {
        System.out.println("添加用户" + userEntry.getName());
        return userEntry.getId();
    }

    @Override
    public void delUser(String userId) {
        System.out.println("删除用户");
    }
}
