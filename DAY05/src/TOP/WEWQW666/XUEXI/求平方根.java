package TOP.WEWQW666.XUEXI;

import java.util.Scanner;

public class 求平方根 {
    public static void main(String[] args) {
        //需求：
        //键盘录入一个大于等于2的整数X
        //计算并返回X的平方根
        //结果只保留整数部分
        //小数部分将被舍去
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于二的整数");
        int a=sc.nextInt();

        for (int i = 1; i < a; i++) {
            int b= i*i;
            if (b >a) {
                int c=i-1;
                System.out.println(a+"的平方根在"+(i-1)+"和"+i+"之间");
                break;
            }else if (b ==a) {
                System.out.println(a+"的平方根是"+i);
                break;
            }
        }
    }
}
