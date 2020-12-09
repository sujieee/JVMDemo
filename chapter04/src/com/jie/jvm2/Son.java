package com.jie.jvm2;

/**
 * Son
 *
 * @author Jie
 * @description 解析调用中非虚方法，虚方法的测试
 * @create 2020/12/09 01:00
 */
class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}
public class Son extends Father{
    public Son() {
        super();
    }
    public Son(int age) {
        this();
    }
    //这是Son的静态方法，不是重写的，因为静态方法不可以被重写
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }
    private void showPrivate(String str) {
        System.out.println("son private " + str);
    }
    public void show() {
        //invokestatic
        showStatic("atguigu.com");
        //invokestatic
        super.showStatic("good!");
        //invokespecial
        showPrivate("hello!");
        //invokestaic
        super.showCommon();
        //invokevirtual
        showFinal();//因为此方法声明有final，不能被子类重写，所以也认为此方法是非虚方法
        //虚方法如下：
        //invokevirtual
        showCommon();
        //invokevirtual
        info();

        MethodInterface in = null;
        //invokeinterface
        in.methodA();
    }
    public void info() {

    }
    public void display(Father f) {
        f.showCommon();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}

interface MethodInterface {
    void methodA();
}
