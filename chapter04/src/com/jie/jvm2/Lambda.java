package com.jie.jvm2;

/**
 * Lambda
 *
 * @author Jie
 * @description 体会invokedynamic指令
 * @create 2020/12/10 13:03
 */
@FunctionalInterface
interface Func {
    public boolean func(String str);
}
public class Lambda {
    public void lambda(Func func ,String str){
        func.func(str);
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s->{
            System.out.println(s);
            return true;
        };
        lambda.lambda(func,"hello");
        lambda.lambda(s->{
            System.out.println(s);
            return true;
        },"world");
    }
}
