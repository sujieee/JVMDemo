package com.jie.jvm1;

/**
 * StackFrameTest
 *
 * @author Jie
 * @description
 * @create 2020/12/03 15:50
 */
public class StackFrameTest {
    public static void main(String[] args) {
        try {
            StackFrameTest stackFrameTest = new StackFrameTest();
            stackFrameTest.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main()正常结束");
    }

    public void method1() {
        System.out.println("method1()开始执行...");
        method2();
        System.out.println("method1()执行结束...");
//        System.out.println(10 / 0);
    }

    public int method2() {
        System.out.println("method2()开始执行...");
        int i = 2;
        int j = (int)method3();
        System.out.println("method2()执行即将结束...");
        return i + j;
    }

    public double method3() {
        System.out.println("method3()开始执行...");
        double j = 3.0;
        System.out.println("method3()执行即将结束...");
        return j;
    }
}
