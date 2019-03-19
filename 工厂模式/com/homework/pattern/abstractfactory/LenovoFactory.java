package com.homework.pattern.abstractfactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/19 0:09
 **/
public class LenovoFactory implements IFactory {
    @Override
    public IMouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new LenovoKeyboard();
    }
}
