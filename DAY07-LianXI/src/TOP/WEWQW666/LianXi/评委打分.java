package TOP.WEWQW666.LianXi;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        //需求：
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最
        //高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        ////分析：
        ////1.定义一个数组，用来存储6名评委的打分(0-100)
        int[] sa= sz();
        ////2,求出数组中的最大值
        int a1 = getA1(sa);
        System.out.println("最大值为"+a1);
        ////3,求出数组中的最小值
        int a2 = getA2(sa);
        System.out.println("最小值为"+a2);
        ////4.求出数组中6个分数的总和
        int s1 = getS1(sa, a1, a2);
        System.out.println("平均值为"+s1);
    }

    private static int getS1(int[] sa, int a1, int a2) {
        int a3= sa[0];
        for (int i = 1; i < sa.length; i++) {
            a3=a3+ sa[i];
        }
        System.out.println("总和为"+a3);
        ////5.(总和-最大值-最小值)/4
        int s1=(a3- a1 - a2)/4;
        return s1;
    }

    private static int getA2(int[] sa) {
        int a2= sa[0];
        for (int i = 1; i < sa.length; i++) {
            if (sa[i] <a2) {
                a2= sa[i];
            }
        }
        return a2;
    }

    private static int getA1(int[] sa) {
        int a1= sa[0];
        for (int i = 1; i < sa.length; i++) {
            if (sa[i] >a1) {
                a1= sa[i];
            }
        }
        return a1;
    }

    ////1.我要干嘛？定义一个数组，用来存储6名评委的打分(0~100)
    ////2.我需要什么？都不需要
    ///3.干完了这件事情，是否需要返回？必须返回
    public static int[] sz(){
        int[] sc=new int[6];
        Scanner sa=new Scanner(System.in);
        for (int i = 0; i < sc.length; ) {
            System.out.println("请输入第"+(i+1)+"位评委的打分");
            int aa=sa.nextInt();
            if (aa>=0&&aa<=100) {
                sc[i]=aa;
                i++;
            }else {
                System.out.println("评分不合规范");
            }


        }
        return sc;

    }
}
