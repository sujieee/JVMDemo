package com.jie.jvm1;

/**
 * OperandStackTest
 *
 * @author Jie
 * @description
 * @create 2020/12/04 15:31
 */
public class OperandStackTest {
    public void testAddOperation() {
        // byte,short,char,boolean：都以int型来保存
        byte i = 15;
        int j = 5;
        int k = i + j;

        int m = 8;
        int n = 800;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int h = m + n;
        return h;
    }

    public void testGetSum() {
        // 获取上一个栈帧的返回结果，并压入操作数栈sum位置中
        int sum = getSum();
        int l = 20;
    }

    /*
     * 面视常见的i++和++i的区别
     */
    public void add() {
        //第一类问题
        int i1 = 10;
        i1++;
        System.out.println("i1 = " + i1);

        int i2 = 10;
        ++i2;
        System.out.println("i2 = " + i2);

        //第二类问题
        int i3 = 10;
        int i4 = i3++;
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

        int i5 = 10;
        int i6 = ++i5;
        System.out.println("i5 = " + i5);
        System.out.println("i6 = " + i6);

        //第三类问题
        int i7 = 10;
        i7 = i7++;
        System.out.println("i7 = "+ i7);

        int i8 = 10;
        i8 = ++i8;
        System.out.println("i8 = " + i8);

        //第四类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;
        System.out.println("i9 = " + i9);
        System.out.println("i10 = " + i10);

    }

    public static void main(String[] args) {
        new OperandStackTest().add();
    }

}
