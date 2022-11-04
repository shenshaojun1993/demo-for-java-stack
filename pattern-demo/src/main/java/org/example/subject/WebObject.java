package org.example.subject;

import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Web主题
 */
public class WebObject implements Subject {
    private String msg;

    private static final List<Observer> observerList = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer 某个观察者
     */
    @Override
    public void registerObserver(Observer observer) {
        if (observerList.contains(observer)) {
            return;
        }
        observerList.add(observer);
    }

    /**
     * 去注册观察者
     *
     * @param observer 某个观察者
     */
    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index > 0) {
            observerList.remove(index);
        }
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObservers() {
        if (observerList.size() <= 1) {
            System.out.println("There are no observer, no need to notify anything.");
            return;
        }
        observerList.forEach(observer -> observer.update(msg));
    }

    /**
     * 设置主题的消息
     *
     * @param msg 消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
