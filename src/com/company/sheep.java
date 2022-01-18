package com.company;

public class sheep extends Animal{
    protected String lastSheared;

    public sheep(String name, int age, String breed, String lastSheared) {
        super(name, age, breed);
        this.lastSheared = lastSheared;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", lastSheared='" + lastSheared + '\'' +
                '}';
    }

    public String getLastFed() {
        return lastSheared;
    }

    public void setLastFed(String lastFed) {
        this.lastSheared = lastSheared;
    }
}
