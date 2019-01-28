package com.designpattern.singleton;

/**
 * @Author wangqd
 * @DATE 2019/1/27
 */
public class LazySingleton2 {

    private static volatile LazySingleton2 instance = null;

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }

}
