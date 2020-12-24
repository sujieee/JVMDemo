package com.jie.jvm2;

/**
 * StackAllocation
 * -Xms1G -Xmx1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * @author Jie
 * @description 栈上分配测试
 * @create 2020/12/23 16:52
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        //查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start)+"ms");
        //为了方便查看堆内存中对象个数，线程sleep
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class User {

    }
    private static void alloc() {
        User user = new User();//未发生逃逸
    }
}
