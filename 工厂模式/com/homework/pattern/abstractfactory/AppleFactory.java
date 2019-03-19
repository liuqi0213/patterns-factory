package com.homework.pattern.abstractfactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/19 0:17
 **/
public class AppleFactory implements IFactory {
    @Override
    public IMouse createMouse() {
        return new AppleMouse();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new AppleKeyboard();
    }
}
