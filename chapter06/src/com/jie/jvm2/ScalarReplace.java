package com.jie.jvm2;

/**
 * ScalarReplace
 * 标量替换测试
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 * @author Jie
 * @description
 * @create 2020/12/23 17:17
 */
public class ScalarReplace {
    public static class User {
        public int id;
        public String name;
    }

    public static void alloc(){
        User u = new User();//未发生逃逸
        u.id = 5;
        u.name = "www.atguigu.com";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为："+(end-start)+"ms");
    }
}

/*
*
* class Customer {
*   String name;
*   int id;
*   Account acct;
* }
* class Account {
*   double balance;
* }
* */
