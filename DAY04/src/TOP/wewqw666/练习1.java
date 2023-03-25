package TOP.wewqw666;

import java.util.Scanner;

public class 练习1 {



    public static void main(String[] args) {
          /*需求：键盘录入星期数
显示今天的减肥活动。
周一：跑步
周二：游泳
周三：慢走
周四：动感单车
周五：拳击
周六：
爬山
周日：好好吃一顿*/
        //分析
        //键盘录入星期数
        System.out.println("今天星期几？");
        Scanner aa=new Scanner(System.in);
        System.out.println();

        String b=aa.next();
        switch (b){
            case "1":
                System.out.println("你今天跑步");
                break;
            case "2":
                System.out.println("你今天游泳");
                break;
            case "3":
                System.out.println("你今天慢走");
                break;
            case "4":
                System.out.println("你今天动感单车");
                break;
            case "5":
                System.out.println("你今天拳击");
                break;
            case "6":
                System.out.println("你今天爬山");
                break;
            case "7":
                System.out.println("你今天好好吃一顿");
                break;
            default:
                System.out.println("你确定输入的是正确的星期吗");
        }

    }
}
