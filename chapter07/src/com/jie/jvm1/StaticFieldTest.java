package com.jie.jvm1;

/**
 * StaticFieldTest
 * 静态引用对应的对象实体本身始终都存在堆空间
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails
 *
 * @author J
 * @version 1.0
 * @since 2021/2/20 20:44
 */
public class StaticFieldTest {
    /**
     * 100MB字节数组
     */
    private static byte[] arr = new byte[1024 * 1024 * 100];


    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
