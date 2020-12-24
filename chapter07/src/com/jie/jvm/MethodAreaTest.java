package com.jie.jvm;

/**
 * MethodAreaTest
 * non-final的变量
 * @author Jie
 * @description
 * @create 2020/12/24 10:55
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}
class Order {
    public static int count = 1;
    public final static int number = 2;
    public static void hello() {
        System.out.println("hello!");
    }
}
