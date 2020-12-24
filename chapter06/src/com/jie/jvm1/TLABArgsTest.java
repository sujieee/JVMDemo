package com.jie.jvm1;

/**
 * TLABArgsTest
 * 测试-XX:+UseTLAB 默认情况是开启
 * @author Jie
 * @description
 * @create 2020/12/23 14:27
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
