package com.jie.jvm1;

/**
 * EdenSurvivorTest
 * -Xms600m -Xmx600m
 * -XX:NewRatio 是用来设置新生代与老年代比例。默认是2
 * -XX:-UseAdaptiveSizePolicy 关闭自适应的内存分配策略（暂时用不到）
 * -XX:SurvivorRatio 设置新生代中Eden区与Survivor区的比例。默认值还是8，当前测试的时候是6，但是默认还是8
 * -Xmn 设置新生代的空间的大小 （一般不设置）
 * HotSpot中，Eden空间和另外两个Survivor空间缺省所占的比例为8:1:1，但在当前操作中比例成了6:1:1，使用了-XX:SurvivorRatio=8后可以使得其比例为8:1:1
 * @author Jie
 * @description
 * @create 2020/12/23 11:02
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
