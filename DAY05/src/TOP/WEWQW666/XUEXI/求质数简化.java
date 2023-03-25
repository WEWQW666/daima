package TOP.WEWQW666.XUEXI;

import java.util.Scanner;

public class 求质数简化 {
    public static void main(String[] args) {
        //需求：
        //键盘录入一个正整数，判断该整数是否为
        //质数。
        //质数：只能被1和本身整除
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int a=sc.nextInt();
        boolean c=true;
        int cc=1;
        //非质数的正整数可以通过平方根来推断最小的可以整除的值
        //以此来减小计算次数
        for (int i = 1; i <a; i++) {
            cc++;
            int dd=i*i;

            if (dd>a) {
                break;
            }else if (dd ==a) {

            }
        }

        for (int i = 2; i <= cc; i++) {
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
