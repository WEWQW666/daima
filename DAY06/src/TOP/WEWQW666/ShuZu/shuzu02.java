package TOP.WEWQW666.ShuZu;

import java.util.Scanner;

public class shuzu02 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5
遍历数组得到每一个元素，求数组里面所有的数据和*/
        //定义数组
        int[] a=new int[]{1,2,3,4,5};
        int b=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            b=b+a[i];
        }
        int i=0;
        System.out.println("数组的和为"+b);

        while (true){
            i++;
            System.out.println("请输入第"+i+"个整数,输入数字0结束计算");
            int cc=sc.nextInt();
            c=c+cc;
            if (cc == 0) {
                break;
            }
        }


        System.out.println("你输入的"+i+"个整数的和为"+c);
    }
}
