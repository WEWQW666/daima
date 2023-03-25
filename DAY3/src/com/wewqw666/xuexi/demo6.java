package com.wewqw666.xuexi;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        //运用三元运算符获取整数较大值
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a=sc.nextInt();
        System.out.println("输入第二个值");
        int b=sc.nextInt();
        String aa=a==b ? "相同":"不同";
        System.out.println("这两个值--");
        System.out.println(aa);

        //需求：求三个数中的最大值
        System.out.println("求输入的三个数中的最大值");
        System.out.println("第一个值");
        int a1=sc.nextInt();
        System.out.println("第二个值");
        int a2=sc.nextInt();
        System.out.println("第三个值");
        int a3=sc.nextInt();
        int b1=a1>a1 ? a1:a2;
        int b2=b1>a3 ? b1:a3;
        System.out.println("这三个值中最大的是"+b2);



    }
}
