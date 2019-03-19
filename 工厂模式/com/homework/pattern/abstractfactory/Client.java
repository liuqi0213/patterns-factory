package com.homework.pattern.abstractfactory;

import com.homework.pattern.factorymethod.IBook;
import com.homework.pattern.factorymethod.IBookFactory;
import com.homework.pattern.factorymethod.JavaBookFactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/18 23:21
 **/
public class Client {

    public static void main(String[] args) {
        IFactory lenovoFactory = new LenovoFactory();
        lenovoFactory.createMouse().getName();
        lenovoFactory.createKeyboard().getName();

        IFactory appleFactory = new AppleFactory();
        appleFactory.createMouse().getName();
        appleFactory.createKeyboard().getName();

    }
}
