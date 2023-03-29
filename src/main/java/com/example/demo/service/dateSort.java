package com.example.demo.service;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;

import java.util.*;
import java.util.stream.Collectors;

public class dateSort {
    public static void main(String[] args) {

        //1.能不能传环节实例Id

        //2.不能传，根据环节定义Id找到所有环节，找最新的环节
        List<Map> updateTimeList = new ArrayList<>();

        HashMap<String, String> hashMap1 = MapUtil.newHashMap();
        hashMap1.put("createTime","2020-09-23 13:20:53");
        hashMap1.put("no1","小");

        HashMap<String, String> hashMap0 = MapUtil.newHashMap();
        hashMap0.put("createTime","2021-09-23 13:20:55");
        hashMap0.put("no1","超大");

        HashMap<String, String> hashMap2 = MapUtil.newHashMap();
        hashMap2.put("createTime","2021-09-23 13:20:53");
        hashMap2.put("no1","中");

        HashMap<String, String> hashMap3 = MapUtil.newHashMap();
        hashMap3.put("createTime","2021-09-23 13:20:54");
        hashMap3.put("no1","大");

        updateTimeList.add(hashMap1);
        updateTimeList.add(hashMap0);
        updateTimeList.add(hashMap2);
        updateTimeList.add(hashMap3);

        System.out.println(updateTimeList);

        List<Map> maxUpdateTime = updateTimeList.stream().sorted(new Comparator<Map>() {
            @Override
            public int compare(Map m1, Map m2) {
                try {
                    DateTime d1 = DateUtil.parse((String) m1.get("createTime"));
                    DateTime d2 = DateUtil.parse((String) m2.get("createTime"));
                    //正序
                    //return d1.compareTo(d2);
                    //倒序
                    return d2.compareTo(d1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }
        }).collect(Collectors.toList());
        System.out.println(updateTimeList);
        System.out.println(maxUpdateTime);
        //3.取最新环节的创建时间

        //4.查创建时间至今范围内环节意见
    }
}
