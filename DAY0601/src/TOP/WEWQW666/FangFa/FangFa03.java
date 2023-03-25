package TOP.WEWQW666.FangFa;

import java.util.Scanner;

public class FangFa03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("第一个值");
        int a=sc.nextInt();
        System.out.println("第二值");
        int b=sc.nextInt();
        adds(a,b);

    }
    public static void adds(int num1,int num2){
        int c=num1+num2;
        System.out.println(c);
    }
}
