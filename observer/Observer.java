package com.coco.observer;


/**
 * @author #L
 * @date 2020/12/10
 */
public interface Observer {
    /**
     * 更新气温,湿度,气压
     *
     * @param temperature 气温
     * @param humidity    湿度
     * @param pressure    气压
     */
    void update(float temperature, float humidity, float pressure);
}
