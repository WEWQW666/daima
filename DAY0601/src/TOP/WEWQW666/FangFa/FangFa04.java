package TOP.WEWQW666.FangFa;

import java.util.Scanner;

public class FangFa04 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。
        //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入长度");
        double a=sc.nextDouble();
        System.out.println("请输入宽度");
        double b=sc.nextDouble();

        //将值传输个方法
        jisuan(a,b);



    }
    //我要干嘛？
    //求长方形的周长
    //需要怎么干？
    //需要知道长宽相加
    public static void jisuan(double  len,double width){
        //定义一个变量c,存周长
        double c=(len+width)*2;
        System.out.println("周长为"+c);

    }
}
