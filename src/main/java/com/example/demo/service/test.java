package com.example.demo.service;

import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.*;

@Component
public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("quiteNotBad");
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }
        HashMap<String, List> stringListHashMap = new HashMap<>();

        Iterator<String> iterator1 = stringListHashMap.keySet().iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
        }


        Iterator<Map.Entry<String, List>> iterator = stringListHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List> next = iterator.next();
            String key = next.getKey();
            List value = next.getValue();
        }

        for (Map.Entry<String, List> map : stringListHashMap.entrySet()) {
            String key = map.getKey();
            List value = map.getValue();
        }

        stringListHashMap.forEach((key,value)->{
            String key1 = key;
            List list = value;
            list.removeIf(kayak -> kayak.equals("123"));
            list.stream().forEach(str ->{
                System.out.println(str);
            });
            System.out.println(key);
            System.out.println(value);
        });

        System.out.println("------------------------------------");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);

        objects.stream().forEach(str ->{
            System.out.println(str);
        });

    }
}
