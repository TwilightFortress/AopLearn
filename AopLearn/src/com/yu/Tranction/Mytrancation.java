package com.yu.Tranction;

/**
 * @author yuyang
 * @create 2019-05-29 14:40
 */
public class Mytrancation {

    public void before(){
        System.out.println("事物开启");
    }

    public void after(){
        System.out.println("事物结束");
    }
}
