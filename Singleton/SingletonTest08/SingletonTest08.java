package com.coco.Singleton.SingletonTest08;

/**
 * 单例模式:懒汉式(枚举实现,线程安全,推荐使用)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.SINGLETON;
        Singleton singleton2 = Singleton.SINGLETON;

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        singleton1.sayOk();
    }
}

enum Singleton {
    /**
     * Singleton实例
     */
    SINGLETON;

    public void sayOk() {
        System.out.println("Ok~");
    }
}
