package TOP.wewqw666;

import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个回文数");
        int a=sc.nextInt();
        int a1=a;
        int b=0;
        while (a!=0){
           int c=a%10;
            a=a/10;
            b=b*10+c;
        }
        System.out.println("值倒过来为"+b);
        if (a1 == b) {
            System.out.println("这是一个回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
