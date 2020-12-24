package com.jie.jvm2;

/**
 * SynchronizedTest
 * 代码优化：同步省略说明
 * @author Jie
 * @description
 * @create 2020/12/23 17:08
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized (hollis){
            System.out.println(hollis);
        }
    }
}
