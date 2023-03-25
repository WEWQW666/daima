package TOP.WEWQW666.FangFa;

import java.util.Scanner;

public class FangFa010 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处

        //定义一个数组
        int[] arr={11,12,13,14,15,16,17,18,19};
        //获取需要判断的值
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要判断的值");
        int c=sc.nextInt();

        //接受返回的值
        boolean panduan=JudgeExistence(arr,c);

        //打印
        if (panduan) {
            System.out.println("这个值存在");
        }else {
            System.out.println("这个值不存在");
        }


    }
    //1、我要干嘛 判断某个数三个hi否存在
    //2、我需要啥？  判断的值，数组
    //需要返回值吗  需要
    public static boolean JudgeExistence(int[] arr,int a){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a) {
                return true;
            }
        }
        return false;
    }
}
