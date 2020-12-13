package com.jie.jvm3;

/**
 * VirtualMethodTable
 *
 * @author Jie
 * @description 虚方法表的举例
 * @create 2020/12/11 23:53
 */
interface Friendly {
    void sayHello();
    void sayGoodbye();
}
class Dog {
    public void sayHello(){}

    @Override
    public String toString() {
        return "Dog";
    }
}
class Cat implements Friendly {
    public void eat() {}

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    @Override
    protected void finalize() throws Throwable {

    }

    @Override
    public String toString() {
        return "Cat";
    }
}
class CockerSpaniel extends Dog implements Friendly {

    @Override
    public void sayHello(){
        super.sayHello();
    }

    @Override
    public void sayGoodbye() {

    }
}
public class VirtualMethodTable {

}
