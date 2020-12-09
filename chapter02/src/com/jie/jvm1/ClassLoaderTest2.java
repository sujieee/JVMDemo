package com.jie.jvm1;

/**
 * ClassLoaderTest2
 *
 * @author Jie
 * @description 获取ClassLoader的途径
 * @create 2020/12/2 12:33
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(parent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
