package com.coco.Singleton.SingletonTest02;

/**
 * 单例模式:懒汉式(静态代码块)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {
    private final static Singleton SINGLETON;

    private Singleton() {

    }

    //Singleton类加载时先执行静态代码块
    static {
        SINGLETON = new Singleton();
    }

    public static Singleton getSingleton() {
        return SINGLETON;
    }
}
