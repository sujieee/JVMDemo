package com.jie.jvm;

/**
 * IHaveNatives
 *
 * @author Jie
 * @description
 * @create 2020/12/22 11:02
 */
public class IHaveNatives {
    public native void Native1(int x);
    public native static long Native2();
    private native synchronized float Native3(Object o);
    native void Native4(int[] any) throws Exception;
}
