package TOP.WEWQW666.XUEXI;

public class 逢七过 {
    public static void main(String[] args) {
        //朋友聚会的时候可能会玩一个游戏：逢7过
        //游戏规则：从任意一个数开始报数，当你要报的数字是包含7或者是7的倍
        //数时都要说过：过
        //需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
        //int a=76%10;
        //int a=100%7;

        //System.out.println(a);
        for (int i = 1; i <=100; i++) {
          if ((i/10)%10==7||i%7==0 || i%10==7) {
                System.out.println("过");
                continue;
           }
           System.out.println(i);
       }
    }
}
