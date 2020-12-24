package com.jie.jvm;

/**
 * HeapDemo
 * -Xms10m -Xmx10m
 * @author Jie
 * @description
 * @create 2020/12/22 17:37
 */
public class HeapDemo {
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
