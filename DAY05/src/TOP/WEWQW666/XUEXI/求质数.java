package TOP.WEWQW666.XUEXI;

import java.util.Scanner;

public class 求质数 {
    public static void main(String[] args) {
        //需求：
        //键盘录入一个正整数，判断该整数是否为
        //质数。
        //质数：只能被1和本身整除
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int a=sc.nextInt();
        boolean c=true;

        for (int i = 2; i < a; i++) {
            if (a%i==0) {
                c=false;
                break;
            }
        }
        if (c ) {
            System.out.println("这是一个质数");
        }else {
            System.out.println("不是质数");
        }
    }
}
