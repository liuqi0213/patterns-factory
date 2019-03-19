package com.homework.pattern.factorymethod;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/18 23:50
 **/
public class EnglishBookFactory implements IBookFactory {
    @Override
    public IBook create() {
        return new EnglishBook();
    }
}
