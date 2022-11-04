package org.example.observer;

import org.example.subject.WebObject;
import org.junit.*;

public class WebObserverTest {
    private static final WebObject WEB_OBJECT = new WebObject();

    private static WebObserver webObserver;

    private static ClientObserver clientObserver;

    @BeforeClass
    public static void setUp() {
        WEB_OBJECT.setMsg("This is a web object.");
        webObserver = new WebObserver(WEB_OBJECT);
        clientObserver = new ClientObserver(WEB_OBJECT);
    }

    @AfterClass
    public static void tearDown() {
        WEB_OBJECT.removeObserver(webObserver);
        WEB_OBJECT.removeObserver(clientObserver);
    }

    @Test
    public void update() {
        WEB_OBJECT.notifyObservers();
    }
}