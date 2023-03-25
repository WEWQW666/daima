package TOP.WEWQW666.FangFa;

import java.util.Scanner;

public class FangFa02 {
    public static void main(String[] args) {
        //用最简单的方法格式完成练习
        nvpengyou();
        //人肉计算器
        //需求：定义一个方法，在方法内部定义两个变量。
        //求出他们的和并进行打印。
        //执行方法
        JiSuan();

    }
    public static void nvpengyou(){
        System.out.println("小美美");
        System.out.println("御姐");
        System.out.println("漂亮");

    }
    public static void JiSuan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a=sc.nextInt();
        System.out.println("请输入第二个值");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
    }
}
//adecb