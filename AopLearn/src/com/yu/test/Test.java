package com.yu.test;

import com.yu.Tranction.Mytrancation;
import com.yu.bean.UserEntry;
import com.yu.proxy.ObjectInterceptor;
import com.yu.proxy.USerProxyStatic;
import com.yu.service.UserService;
import com.yu.serviceImpl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author yuyang
 * @create 2019-05-29 14:47
 */
public class Test {
    public static void main(String[] args) {
        Object target = new UserServiceImpl();
        Mytrancation transaction = new Mytrancation();

/*        USerProxyStatic userProxy = new USerProxyStatic(userService, transaction);
        userProxy.addUser();
        userProxy.delUser();*/

        ObjectInterceptor proxyObject = new ObjectInterceptor(target,transaction);

        //代理类
        UserService userService = (UserService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxyObject);
        userService.addUser(new UserEntry("123","name"));
    }
}
