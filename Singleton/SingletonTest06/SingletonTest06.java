package com.coco.Singleton.SingletonTest06;

/**
 * 单例模式:懒汉式(双重检查,线程安全,不影响效率)
 *
 * @author #L
 * @date 2020/12/13
 */
public class SingletonTest06 {
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
     * volatile关键字让singleton的修改立即更新到主存中
     */
    private static volatile Singleton singleton;

    private Singleton() {

    }

    /**
     * 两次检查singleton,即使在第一次检查singleton时有多个线程进入,
     * 之后因为第一个进入的线程创建了实例,再通过volatile关键字将更改立即更新到主存中,
     * 后来的线程第二次检查singleton时已经不为null了
     * 而在Singleton实例创建成功后,后面再调用此方法时,只需要进行一次判断,所以并不影响效率
     *
     * @return Singleton实例
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
