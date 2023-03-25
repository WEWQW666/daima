package TOP.WEWQW666.FangFa;

import java.util.Scanner;

public class FangFa05 {
    public static void main(String[] args) {
        //人肉计算机2
        //
        //需求：定义一个方法，求圆的面积，将结果在方法中进行打印。
        Scanner sc=new Scanner(System.in);
        System.out.println("圆的半径为");
        double a=sc.nextDouble();
        //将值传给方法
        yuan(a);
    }
    //定义一个求圆的面积的方法
    //求圆的面积的公式：s=πr*r
    //只需知道r即可
    public static void yuan(double r){
        //定义变量c接收圆的面积
        double c=3.14*r*r;
        System.out.println("这个圆的面积是"+c);
    }
}
