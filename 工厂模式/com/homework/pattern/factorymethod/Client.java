package com.homework.pattern.factorymethod;

import sun.plugin2.ipc.IPCFactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/18 23:21
 **/
public class Client {

    public static void main(String[] args) {
        IBookFactory javaBookFactory = new JavaBookFactory();
        IBook javaBook = javaBookFactory.create();
        System.out.println(javaBook.getName());

    }
}
