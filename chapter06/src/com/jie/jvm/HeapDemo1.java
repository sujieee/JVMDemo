package com.jie.jvm;

/**
 * HeapDemo1
 * -Xms20m -Xmx20m
 * @author Jie
 * @description
 * @create 2020/12/22 17:38
 */
public class HeapDemo1 {
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
