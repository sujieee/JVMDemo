package com.jie.jvm;

/**
 * MethodAreaDemo
 * 测试设置方法区大小参数的默认值
 *
 * jdk8及以后：
 *  -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 * @author Jie
 * @description
 * @create 2020/12/23 18:06
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
