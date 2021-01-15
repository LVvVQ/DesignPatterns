package com.coco.Singleton.SingletonTest05;

/**
 * 单例模式:懒汉式(线程不安全,效率低下,错误写法)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest05 {
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

    /**
     * 同步代码块,但线程是不安全的,在if判断时还是有可能有多个线程进入,而且排队生成实例降低了效率,所以这种写法根本就是错误的
     *
     * @return Singleton实例
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
