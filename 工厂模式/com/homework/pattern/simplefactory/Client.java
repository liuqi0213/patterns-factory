package com.homework.pattern.simplefactory;

/**
 * @author lq
 * @version 1.0
 * @desc
 * @date 2019/3/18 23:21
 **/
public class Client {

    public static void main(String[] args) {
        IBook javaBook = BookFactory.createBook(JavaBook.class);
        IBook englishBook = BookFactory.createBook(EnglishBook.class);

        System.out.println(javaBook.getName());
        System.out.println(englishBook.getName());

    }
}
