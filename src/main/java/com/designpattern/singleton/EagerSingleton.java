package com.designpattern.singleton;

/**
 * @Author wangqd
 * @DATE 2019/1/25
 */
public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
