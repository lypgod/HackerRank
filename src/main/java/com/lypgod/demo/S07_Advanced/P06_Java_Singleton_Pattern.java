package com.lypgod.demo.S07_Advanced;

public class P06_Java_Singleton_Pattern {
}

class Singleton {
    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return new Singleton();
    }
}