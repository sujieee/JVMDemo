package com.jie.jvm3;

/**
 * StringBuilderTest
 *
 * @author Jie
 * @description 方法中定义的局部变量是否线程安全？具体情况具体分析
 * @create 2020/12/17 21:41
 *
 *  何为线程安全？如果只有一个线程才可以操作此数据，则必是线程安全的。
 *  如果有多个线程操作此数据，则此数据是共享数据。如果不考虑同步机制的话会存在线程安全问题
 */
public class StringBuilderTest {
    //s1的声明方式是线程安全的
    public static void method1() {
        //StringBuilder：线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
    }

    //s2的操作过程：是线程不安全的
    public static void method2(StringBuilder s2) {
        s2.append("a");
        s2.append("b");
    }

    //s3的操作：是线程不安全的
    //返回值StringBuilder 操作过程种可能存在线程不安全问题
    public static StringBuilder method3() {
        StringBuilder s3 = new StringBuilder();
        s3.append("a");
        s3.append("b");
        return s3;
    }

    //s4的操作过程：是线程安全的
    //s4.toString() 可能是不安全的，但是s4这个StringBuilder声明的变量已经是安全的了，已经内部消亡了，
    // 因为返回的是s4.toString()，操作的也是这个String了，这个String可能是不安全的
    public static String method4() {
        StringBuilder s4 = new StringBuilder();
        s4.append("a");
        s4.append("b");
        return s4.toString();
    }


    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        //分线程启动
        new Thread(()->{
            s.append("a");
            s.append("b");
        }).start();
        //主线程继续执行，可能存在线程不安全问题，对s的操作过程
        method2(s);
    }
}
