package com.yu.proxy;

import com.yu.Tranction.Mytrancation;
import com.yu.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yuyang
 * @create 2019-05-29 15:07
 */
public class ObjectInterceptor implements InvocationHandler {

    Object target;

    Mytrancation trancation;

    public ObjectInterceptor(Object target, Mytrancation trancation) {
        this.target = target;
        this.trancation = trancation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        trancation.before();
                            //切入点：全部的方法
        method.invoke(this.target,args);
        trancation.after();
        //上三行结合组成切面：advice + cutpoint
        return null;
    }
}
