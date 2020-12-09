package com.jie.jvm1;

/**
 * DynamicLinkingTest
 *
 * @author Jie
 * @description
 * @create 2020/12/06 11:20
 */
public class DynamicLinkingTest {

    //动态链接（或指向运行时常量池的引用）

    int num = 10;

    public void methodA() {
        System.out.println("methodA()...");
    }

    public void methodB() {
        System.out.println("methodB()...");
        methodA();
        num++;
    }

    /*
    常量池的作用就是为了提供一些符号和常量，便于指令的识别
     */
}
