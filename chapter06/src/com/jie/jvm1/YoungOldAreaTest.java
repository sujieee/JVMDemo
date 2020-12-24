package com.jie.jvm1;

/**
 * YoungOldAreaTest
 * 测试：大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * @author Jie
 * @description
 * @create 2020/12/23 13:42
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024*1024*20];//20m
    }
}
