package com.jie.jvm1;

/**
 * StringTest
 *
 * @author Jie
 * @description
 * @create 2020/12/2 12:38
 */
public class StringTest {

    public static void main(String[] args) {

        // 当前String用的还是java核心类库里的（因为类加载器的双亲委派机制）
        String str = new String();
        System.out.println("hello,string");

        StringTest stringTest = new StringTest();
        System.out.println(stringTest.getClass().getClassLoader());
    }
}
