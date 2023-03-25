package TOP.WEWQW666.LianXi;

import java.util.Scanner;

public class ZHLX01 {

    public static void main(String[] args) {
        //需求：
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        //●按照如下规则计算机票价格：旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7
        //折，经济舱6.5折。

        //1、输入机票原价、月份和头等舱或经济舱
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价");
        double ticket=sc.nextDouble();
        System.out.println("请输入月份");
        int mouth=sc.nextInt();

        System.out.println("请输入头等舱 0 或经济舱 1");
        ticket = getTicket(sc, ticket, mouth);

        //4、计算价格
        System.out.println(ticket);

    }

    private static double getTicket(Scanner sc, double ticket, int mouth) {
        int seat= sc.nextInt();
        //2、判断淡旺季
        if (mouth >= 5 && mouth <= 10) {
            //3、判断头等舱或经济舱
            ticket = getTicket(ticket, seat, 0.9, 0.85);
            //ticket=addpd(ticket,seat,0.9,0.85);
        } else if (mouth >= 11 && mouth <= 12 || mouth >= 1 && mouth <= 4) {
            //3、判断头等舱或经济舱
            //ticket=addpd(ticket,seat,0.7,0.65);
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("没有这个月份");
        }
        return ticket;
    }

    private static double getTicket(double ticket, int seat, double v, double v2) {
        if (seat == 0) {
            ticket = ticket * v;

        } else if (seat == 1) {
            ticket = ticket * v2;

        } else {
            System.out.println("没有这个舱位");
        }

        return ticket;

    }
    //1.我要干嘛？根据舱位和折扣来计算最终的票价
    //2.我干这件事，需要什么才能完成？原价舱位头等舱的折扣经济舱的折扣
    //3.方法的调用处是否需要继续使用这个结果  需要
    /*public static double addpd(double ticket,int seat,double a0,double a1){
        if (seat == 0) {
            ticket=ticket*a0;

        }else if (seat == 1) {
            ticket=ticket*a1;

        }else {
            System.out.println("没有这个舱位");
        }
        return ticket;

    }*/
}
