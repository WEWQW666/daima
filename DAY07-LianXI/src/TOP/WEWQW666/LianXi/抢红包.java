package TOP.WEWQW666.LianXi;

import java.util.Random;

public class 抢红包 {
    public static void main(String[] args) {
        /*需求：
        一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，
        打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：(随机顺序，不一定是下面的顺序)*/
        //定义数组表示奖池
        int[] ssr={2,588,888,1000,10000};
        Random sa=new Random();
        for (int i = 0; i < ssr.length; i++) {
            //获取随机索引
            int x=sa.nextInt(ssr.length);
            int temp=ssr[i];
            ssr[i]=ssr[x];
            ssr[x]=temp;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.println(ssr[i]);
        }

    }
}
