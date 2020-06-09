package com.jh.test;


import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        ArrayList admin = new ArrayList();

        admin.add("admin");
        admin.add(0, 123);
        System.out.println(admin);

        try {
            Date date = new Date();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }

}
