package com.coco.Singleton.SingletonTest07;

/**
 * 单例模式:懒汉式(静态内部类,线程安全,不降低效率)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {
    private Singleton() {

    }

    /**
     * 外部类加载时不会加载静态内部类,所以只有在调用getSingle()方法使用到SingletonInstance时才会加载
     */
    private static class SingletonInstance {
        private final static Singleton SINGLETON = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonInstance.SINGLETON;
    }
}
