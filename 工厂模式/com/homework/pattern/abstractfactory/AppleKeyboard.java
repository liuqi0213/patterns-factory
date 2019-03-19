package com.homework.pattern.abstractfactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/19 0:16
 **/
public class AppleKeyboard implements IKeyboard {
    @Override
    public void getName() {
        System.out.println("this is apple keyboard!");
    }
}
