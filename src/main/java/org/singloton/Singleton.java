package org.singloton;

import java.util.ResourceBundle;

public class Singleton {
    private static Singleton instance;
    private ResourceBundle value;
    private Singleton(ResourceBundle  value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(ResourceBundle  value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public ResourceBundle getValue() {
        return value;
    }
}
