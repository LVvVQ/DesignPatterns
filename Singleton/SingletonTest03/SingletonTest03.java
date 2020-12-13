package com.coco.Singleton.SingletonTest03;

/**
 * 单例模式:懒汉式(线程不安全)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        //if判断时有可能去执行另一个线程,导致两个线程都去创建实例,所以这是线程不安全的
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
