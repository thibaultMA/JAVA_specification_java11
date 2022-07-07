package org.example.data;

public enum targetAPI {
    COMICS("comics"), CHARACTER("characters");
    private final String text;
    private final static Character fin = '?';

    private targetAPI(String s) {
        this.text = s;
    }

    @Override
    public String toString() {
        return text +fin;
    }
}
