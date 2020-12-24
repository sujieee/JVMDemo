package com.jie.jvm1;

import java.util.ArrayList;
import java.util.List;

/**
 * GCTest
 * 测试MinorGC、MajorGC、FullGC
 * @author Jie
 * @description
 * @create 2020/12/23 13:11
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "atguigu.com";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("遍历次数为："+i);
        }
    }
}
