package TOP.WEWQW666.ShuZu;

import java.util.Random;

public class Shuzu06 {
    public static void main(String[] args) {
        //需求：生成10个1~100之间的随机数存入数组。
        //1)求出所有数据的和
        //2)求所有数据的平均数
        //3)统计有多少个数据比平均值小

        //定义动态数组
        int[] arr1=new int[10];

        //定义随机数
        Random sa=new Random();

        //写入随机数
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sa.nextInt(100)+1;
        }

        //1求和
        //定义变量存和
        int a=0;
        for (int i = 0; i < arr1.length; i++) {
            a=a+arr1[i];
        }
        System.out.println("随机十个数的和为"+a);

        //2求平均数
        //定义变量存和
        int b=0;
        int b1;
        for (int i = 0; i < arr1.length; i++) {
            b=b+arr1[i];
        }
        b1=b/arr1.length;
        System.out.println("随机十个数的平均数为"+b1);

        //3统计有多少个数据比平均值小
        //定义变量存值
        int c=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<b1) {
                c++;
            }
        }
        System.out.println("有"+c+"个数据比平均值小");


    }
}
