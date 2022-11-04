package org.example.observer;

import org.example.subject.WebObject;
import org.junit.*;

public class WebObserverTest {
    private static final WebObject WEB_OBJECT = new WebObject();

    private static WebObserver observer1;

    private static WebObserver observer2;

    @BeforeClass
    public static void setUp() {
        WEB_OBJECT.setMsg("This is a web object.");
        observer1 = new WebObserver(WEB_OBJECT);
        observer2 = new WebObserver(WEB_OBJECT);
    }

    @AfterClass
    public static void tearDown() {
        WEB_OBJECT.removeObserver(observer1);
        WEB_OBJECT.removeObserver(observer2);
    }

    @Test
    public void update() {
        WEB_OBJECT.notifyObservers();
    }
}