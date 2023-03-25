package TOP.WEWQW666.LianXi;

import java.util.Random;
import java.util.Scanner;

public class 双色球抽奖 {
    public static void main(String[] args) {
        //生成中奖号码
        int[] arr=WinningNumbers();
        for (int i = 0; i < arr.length; i++) {

        }
        //用户输入中奖号码
        int[] acc=sr();
        System.out.println(acc[1]);
        //判断中奖情况
        //定义红球篮球
        int RedBall=0;
        int Basketball=0;
        //判断红球个数
        for (int i = 0; i < acc.length-1; i++) {
            if (arr[i] == acc[i]) {
                RedBall++;
                break;
            }
        }
        if (arr[arr.length-1] == acc.length-1) {
            Basketball++;
        }

        if (Basketball ==1 && RedBall==6 ) {
            System.out.println("中奖1000万元");
        }else if (Basketball == 0 && RedBall==6) {
            System.out.println("中奖500万元");
        }else if ((Basketball == 0 &&RedBall==5)||(Basketball==1&&RedBall==4)) {
            System.out.println("中奖3000元");
        }else if ((Basketball == 0 &&RedBall==4)||(Basketball==1&&RedBall==3)) {
            System.out.println("中奖10元");
        }else if ((Basketball == 0 &&RedBall==1)||(Basketball==1&&RedBall==1)||(Basketball==1&&RedBall==2)) {
            System.out.println("中奖5元");
        }else {
            System.out.println("谢谢参与");
        }

    }
    public static int[] sr(){
        //定义数组
        int[] arr=new int[7];
        //获得用户输入的数组
        Scanner sc=new Scanner(System.in);
        //用户输入
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("请输入第"+i+"个红球数字");
            arr[i]=sc.nextInt();
            if (arr[i] <1&&arr[i]>33) {
                System.out.println("值超出范围");
            }else if (pd(arr,arr[i])) {
                i++;
            }else {
                System.out.println("有值重复输入了");
            }

        }
        System.out.println("输入蓝球号码");
        boolean a=true;
        while (a){
            arr[arr.length-1]=sc.nextInt();
            if (arr[arr.length-1]>=1&&arr[arr.length-1]<=16) {
                a=false;
            }else {
                System.out.println("号码超出范围");
            }
        }
        return arr;
    }
    public static int[] WinningNumbers(){
        //定义数组
        int[] arr=new int[7];
        //获取红球号码
        Random sc=new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            arr[i]=sc.nextInt(33)+1;
            boolean ss=pd(arr,arr[i]);
            System.out.print(arr[i]+"");
            if (!ss ) {
                i++;
            }
           //获取篮球号码


        }
        arr[6]=sc.nextInt(16)+1;
        return arr;
    }
    public static boolean pd(int[] arr,int a){
        boolean sc=true;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+",,"+a);
            if (arr[i] == a) {
                sc=false;
                break;
            }
        }
        return sc;
    }
}
