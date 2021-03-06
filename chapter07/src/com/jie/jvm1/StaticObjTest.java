package com.jie.jvm1;

/**
 * StaticObjTest
 * staticObj、instanceObj、localObj这三个变量本身存放在哪
 * 分析：staticObj随着Test的类型信息存放在方法区这个规范中，从《Java虚拟机规范》所定义的概念模型来看，所有Class相关的信息都应该存放在方法区中，但方法区该如何实现，《Java虚拟机规范》并未做出规定，这就成了一件允许不同虚拟机自己灵活把握的事情，jdk1.7及其以后版本的HotSpot虚拟机选择把静态变量与类型在Java语言一端的映射Class对象存放在一起，存储于Java堆之中，也就是说staticObj在jdk1.7及其以后版本是存在堆中的。instanceObj随着Test的对象实例存放在Java堆。localObj存放在foo()方法栈帧的局部变量表中。
 *
 * @author J
 * @version 1.0
 * @since 2021/2/20 21:05
 */
public class StaticObjTest {
    static class Test {
        //staticObj随着Java语言一端的映射Class对象存放在堆中
        static ObjectHolder staticObj = new ObjectHolder();
        //instanceObj随着Test的对象实例存放堆中
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            //localObj存在foo()方法栈帧的局部变量表中
            ObjectHolder localObj = new ObjectHolder();
            //在下面这一行上打个断点进行调试，然后用jhsdb分析即可,启动命令java -cp .\sa-jdi.jar sun.jvm.hotspot.HSDB
            System.out.println("done");
        }
    }

    private static class ObjectHolder {
    }

    public static void main(String[] args) {
        Test test = new StaticObjTest.Test();
        test.foo();
    }
}
