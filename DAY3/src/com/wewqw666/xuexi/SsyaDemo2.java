package com.wewqw666.xuexi;

import java.util.Scanner;

public class SsyaDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println("除法");
        System.out.println("10/2");
        System.out.println(10/2);
        System.out.println("10/3=");
        System.out.println(10/3);
        //结论
        System.out.println("10.0/3=");
        System.out.println(10.0/3);
        //取模取余实际也是进行除法操作,只不过得到的是余数
        System.out.println("取模");
        System.out.println("10%2=");
        System.out.println(10%2);
        System.out.println("10%3=");
        System.out.println(10%3);

        //应用场景
        //1.可以用取模来判断,A是否可以被B整除
        //A%B 10%3
        //2.可以判断A是否为偶数 ,能被整除则为偶数
        //3.游戏


        //练习1.数值拆分
        //需求:键盘录入一个三位数,将其拆分为个位,十位,百位,打印在控制台
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.printf("请输入一个三位数");
        int i= sc.nextInt();
        System.out.println("//练习1.数值拆分\n" +
                "        //需求:键盘录入一个三位数,将其拆分为个位,十位,百位,打印在控制台");

        int a=i%10;
        System.out.println("个位");
        System.out.println(a);
        int b=i/10%10;
        System.out.println("十位");
        System.out.println(b);
        int c=i/100%10;
        System.out.println("百位");
        System.out.println(c);
        System.out.println();



    }
}
