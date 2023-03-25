package TOP.wewqw666;

import java.util.Scanner;

public class SWITCH {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("你想吃的面请输入序号");
        System.out.println("1.兰州拉面");
        System.out.println("2.武汉热干面");
        System.out.println("3.炸酱面");
        System.out.println("4.红烧牛肉面");
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("吃拉面;");
                break;
            case 2:
                System.out.println("吃武汉热干面;");
                break;
            case 3:
                System.out.println("吃炸酱面");
                break;
            case 4:
                System.out.println("吃武红烧牛肉面");
                break;
            default:
                System.out.println("无此面");
                break;


        }
        switch (a){
            case 1 -> System.out.println("111111");

        }
        switch (a){
            case 1,2,3->System.out.println("工作日");
            case 4->System.out.println("休息日");
            default->System.out.println("没有这个星期");
        }
    }

}
