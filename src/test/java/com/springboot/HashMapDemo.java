package com.springboot;


import java.util.HashMap;

/**
 * @Auther: qinyx
 * @Date: 2019/5/7/0007 09:52
 * @Description:
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("s", "30");
        hashMap.put("s", "31");
        System.out.println("控制台输出:" + hashMap.get("s"));
        new HashMap<>();


    }


}
