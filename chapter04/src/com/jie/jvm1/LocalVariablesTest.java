package com.jie.jvm1;

import java.util.Date;

/**
 * LocalVariablesTest
 *
 * @author Jie
 * @description
 * @create 2020/12/03 17:46
 */
public class LocalVariablesTest {
    private int count = 2;

    public static void main(String[] args) {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        int num = 10;
        localVariablesTest.test1();
    }

    // 关于Slot的使用和理解
    public LocalVariablesTest(){
        this.count = 1;
    }

    public void test1() {
        Date date = new Date();
        String name1 = "jie";
        String test2 = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP,String name2) {
        dateP = null;
        name2 = "su";
        //double 要占据两个Slot 但是从起始索引开始标记
        double weight = 123.0;
        char gender = '男';//weight局部变量作用域的起始位置
        return dateP + name2;
    }

    public void test3(String ab) {
        count++;
    }

    public void test4() {
        int a = 0;
        //作用域
        //b会被排在局部变量表LocalVariableTable中Nr. 0位置，当然对于该方法，this还是起始PC为0
        //只不过由于该方法中有了这个代码块（该代码块中只定义了一个b变量），所以this变量在局部变量表LocalVariableTable中Nr. 1的位置了
        //对Slot的重复利用，因为b的作用域仅在该代码块中
        {
            int b = 0;
            b = a + 1;
        }
        //变量c使用之前已经销毁的变量b占据的Slot位置，所以才看到局部变量表LocalVariableTable中它的Slot序号和变量b的Slot序号是一样的
        int c = a + 1;
    }

    public static void testStatic() {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        //LocalVariableTable里起始PC 指LocalVariableTable里局部变量作用域的开始位置
        Date date = new Date();
        int count = 10;
        System.out.println(count);
        // 静态方法里面，this变量是不会存在该静态方法的局部变量表中，所以不可以在静态方法中使用this。
        // 而非静态方法(包括构造方法)中，this变量作用域是整个方法，所以其局部变量表中的起始PC和Slot序号都是0
//        System.out.println(this.count);
    }

    /*
    * 变量的分类：按照数据类型分：①.基本数据类型②.引用数据类型
    *           按照在类中声明的位置分：①.成员变量：在使用前，都经历过默认初始化赋值
    *                                   ①.类变量：linking的prepare阶段：给类变量默认赋值--->initial阶段：给类变量显式赋值及静态代码块赋值
    *                                   ②.实例变量：随着对象的创建，会在堆空间中分配实例变量空间，并进行默认赋值
    *                              ②.局部变量：在使用前，必须要进行显式赋值的！否则，编译不通过
    */
    /*局部变量表中的变量也是重要的垃圾回收根节点，只要被局部变量表中直接或间接引用的对象都不会被回收*/
}
