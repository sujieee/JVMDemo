package com.jie.jvm;

/**
 * ClassInitTest
 *
 * @author Jie
 * @description
 * @create 2020/11/30 21:37
 */
public class ClassInitTest {
    private static int num = 1;
//    private static int number = 10;

    static {
        num = 2;
        number = 20;
    }

    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
