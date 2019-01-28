package com.designpattern.singleton;

public enum EnumSingleton {
    INSTANCE;

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setAge(10);
        enumSingleton.setName("wangqd");
        System.out.println(enumSingleton.hashCode());

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1.getAge());
        System.out.println(enumSingleton1.getName());
        System.out.println(enumSingleton1.hashCode());
    }
}