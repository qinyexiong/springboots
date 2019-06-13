package com.springboot;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Objects;

public class NotNullTest {

    public static void main(String[] args) {
        User user = new User();

        String str = "a,b,c,,";
        String[] ary = str.split(",");
        // 预期大于 3，结果是 3
        System.out.println(Objects.requireNonNull(user));


    }
}
