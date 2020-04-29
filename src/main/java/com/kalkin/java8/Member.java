package com.kalkin.java8;

public class Member {

    private String name;
    private boolean haveCar;
    private int age;

    public String getName() {
        return name;
    }

    public boolean isHaveCar() {
        return haveCar;
    }

    public int getAge() {
        return age;
    }

    public Member(String name, boolean haveCar, int age) {
        this.name = name;
        this.haveCar = haveCar;
        this.age = age;
    }


    public boolean hasOver30Age() {
        return this.age > 30;
    }
}
