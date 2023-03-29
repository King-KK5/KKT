package com.example.demo.controller;

public class 工厂 {

    public String 还行(){
        汽车 汽车 = new 汽车();
        汽车.set名字("奔驰");
        return 汽车.get名字();
    }

    public static void main(String[] args) {
        System.out.println(new 工厂().还行());
    }


}
