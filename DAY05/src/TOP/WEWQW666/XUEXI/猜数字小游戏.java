package TOP.WEWQW666.XUEXI;

import java.util.Random;
import java.util.Scanner;

public class 猜数字小游戏 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
        //调用随机生成数字方法
        Random sc=new Random();
        Scanner aa=new Scanner(System.in);
        int a=sc.nextInt(100);
        System.out.println(a);
        while (true){
            int c=aa.nextInt();
            if (c>a) {
                System.out.println("大了");
            }else if (c <a) {
                System.out.println("小了");
            }else if (c == a) {
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
