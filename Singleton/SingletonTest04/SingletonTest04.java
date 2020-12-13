package com.coco.Singleton.SingletonTest04;

/**
 * 单例模式:懒汉式(线程安全,效率低下)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest04 {
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
     * 加了synchronized同步,线程安全了,但是每次调用这个方法都需要等待,极大降低了效率
     *
     * @return Singleton实例
     */
    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}