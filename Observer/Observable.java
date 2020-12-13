package com.coco.Observer;


/**
 * @author #L
 * @date 2020/12/10
 */
public interface Observable {
    /**
     * 注册观察者
     *
     * @param o 要注册的观察者对象
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o 要移除的观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObserver();

}
