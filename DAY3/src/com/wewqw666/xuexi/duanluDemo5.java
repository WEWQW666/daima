package com.wewqw666.xuexi;

import java.util.Scanner;

public class duanluDemo5 {
    public static void main(String[] args) {
        //短路效果
        int a=10;
        int b=20;

     //练习1
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两位整数");
        int i=sc.nextInt();
        int c= i%6;
        System.out.println(c==0||i/10%6==0||i%10/6==1);

    }
}
