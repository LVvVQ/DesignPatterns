package com.coco.Singleton.SingletonTest01;

/**
 * 单例模式:饿汉式(静态常量)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {
    /**
     * SINGLETON是静态常量,只会在Singleton类加载时初始化一次,类加载时是线程安全的,确保只有一个实例
     */
    private final static Singleton SINGLETON = new Singleton();

    /**
     * 构造器私有化,外部不能使用new生成实例
     */
    private Singleton() {

    }

    /**
     * 外部只能通过调用该方法获取Singleton对象实例
     *
     * @return Singleton实例对象
     */
    public static Singleton getSingleton() {
        return SINGLETON;
    }
}
