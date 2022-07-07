package org.singloton;

import java.util.ResourceBundle;

public class app {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(ResourceBundle.getBundle("configuration"));
        System.out.println(singleton.getValue().getString("db.url"));
        System.out.println(singleton.getValue().getString("db.user"));
        System.out.println(singleton.getValue().getString("db.password"));

        Singleton test = Singleton.getInstance(ResourceBundle.getBundle("configuration2"));
        System.out.println(test.getValue().getString("db.url"));
        System.out.println(test.getValue().getString("db.user"));
        System.out.println(test.getValue().getString("db.password"));
    }
}
