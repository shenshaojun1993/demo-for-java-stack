package org.example.observer;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 更新消息
     *
     * @param msg 消息
     */
    void update(String msg);
}
