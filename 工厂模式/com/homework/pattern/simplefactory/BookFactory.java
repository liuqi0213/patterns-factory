package com.homework.pattern.simplefactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/18 23:18
 **/
public class BookFactory {
    public static IBook createBook(Class<? extends IBook> clazz){
        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
