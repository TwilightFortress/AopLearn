package com.yu.proxy;

import com.yu.Tranction.Mytrancation;
import com.yu.bean.UserEntry;
import com.yu.service.UserService;

/**
 * @author yuyang
 * @create 2019-05-29 14:42
 */
public class USerProxyStatic {
    public UserService userService;
    public Mytrancation transaction;

    public USerProxyStatic(UserService userService, Mytrancation tranction) {
        this.userService = userService;
        this.transaction = tranction;
    }

    public void addUser(){
        transaction.before();
        userService.addUser(new UserEntry("123","yu"){});
        transaction.after();
    }

    public void delUser(){
        transaction.before();
        userService.delUser("123");
        transaction.after();
    }
}
