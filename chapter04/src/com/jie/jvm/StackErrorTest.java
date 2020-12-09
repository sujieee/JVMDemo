package com.jie.jvm;

/**
 * StackErrorTest
 *
 * @author Jie
 * @description 演示栈中的异常
 * @create 2020/12/03 15:30
 *
 * 默认情况下：count: 11409
 * 设置栈的大小：-Xss256k count: 2465
 */
public class StackErrorTest {
    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        // oom
        // Exception in thread "main" java.lang.StackOverflowError
        main(args);
    }
}
