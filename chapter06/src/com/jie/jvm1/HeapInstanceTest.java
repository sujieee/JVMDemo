package com.jie.jvm1;

import java.util.ArrayList;
import java.util.Random;

/**
 * HeapInstanceTest
 * -Xms600m -Xmx600m
 * @author Jie
 * @description
 * @create 2020/12/23 12:24
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024*200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
