package TOP.WEWQW666.LianXi;

import java.util.Random;

public class ZHLX03 {
    public static void main(String[] args) {
        /*需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5
                前四位是大写字母或者小写字母
        最后一位是数字
                /1方法：
//在以后如果我们要在一堆没有什么规律的数据中随机抽取
//可以先把这些数据放到数组当中
//再随机抽取一个索引*/

        //分析
        //小写和大写字母放到数组中
        char[] chas=new char[52];
        for (int i = 0; i < chas.length; i++) {
            //ascii表
            if (i <=25) {
                chas[i]=(char) (97+i);
            }else {
                chas[i]=(char) (65+i-26);
            }

        }
        //输出
        for (int i = 0; i < chas.length; i++) {
            System.out.print(chas[i]+",");
        }
        Random sc=new Random();
        String yzm="";

        for (int i = 0; i <5; i++) {
            if (i <4) {
               int s=sc.nextInt(chas.length);
                yzm=yzm+chas[s];
            }else {
                int s=sc.nextInt(9);
                yzm=yzm+s;
            }
        }
        System.out.println();
        System.out.println(yzm);
    }
}
