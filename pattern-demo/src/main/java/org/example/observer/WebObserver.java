package org.example.observer;

import org.example.subject.Subject;
public class WebObserver implements Observer{
    public WebObserver(Subject subject) {
        subject.registerObserver(this);
    }

    /**
     * 做某些事情
     *
     * @param msg 消息
     */
    @Override
    public void update(String msg) {
        System.out.println("Received msg from subject : " + msg + " , do nothing..");
    }
}
