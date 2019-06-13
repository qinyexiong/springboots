package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;

@RunWith(SpringRunner.class)
 @SpringBootTest
public class SpringbootApplicationTests {

   	@Test
   	public void contextLoads() {





  	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //定义一个标记变量
        boolean flag=false;
        for (int i = 2; i <num ; i++) {
            if (num%i==0) {
                flag=true;
            }
        }
        String str=flag?"不是质数":"是质数";
         System.out.println("输出控制台:"+str);

    }

}
