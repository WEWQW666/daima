package TOP.WEWQW666.LianXi;

import java.util.Scanner;

public class 数字加密解密 {
    public static void main(String[] args) {
        /*某系统的数字密码 （大于e）。比如1983，采用加密方式进行传输，
        规则如下：
        每位数加上5
        再对1求余，
        最后将所有数字反转，
        得到一串新数。*/

        //分析
        //1、获取要加密的数字
        /*int[] ssr={1,9,8,3};

        //2、每位数加五
        for (int i = 0; i < ssr.length; i++) {
            ssr[i]=ssr[i]+5;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.print(ssr[i]+",");
        }
        System.out.println();
        //3、对10求余
        for (int i = 0; i < ssr.length; i++) {
            ssr[i]=ssr[i] % 10;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.print(ssr[i]+",");
        }
        System.out.println();
        //4、所有数字反转
        for (int i = 0,  j= ssr.length-1; i < j; i++,j--) {
            int temp=ssr[i];
            ssr[i]=ssr[j];
            ssr[j]=temp;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.print(ssr[i]);
        }
        System.out.println();
        //5、得到新数字
        int ssa=0;
        for (int i = 0; i < ssr.length; i++) {
            ssa=ssa*10+ssr[i];
        }
        System.out.println(ssa);
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要加密的数字");
        int sr=sc.nextInt();
        //2、将数字放入数组
        //获取数字的位数
        int a=sr;
        int counts=0;
        while (a!=0){
            a=a/10;
            counts++;
        }
        int[] ssr=new int[counts];

        while (sr!=0){
            ssr[counts-1]=sr % 10;
            sr=sr/10;
            counts--;
        }
        //2、每位数加五
        for (int i = 0; i < ssr.length; i++) {
            ssr[i]=ssr[i]+5;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.print(ssr[i]+",");
        }
        System.out.println();
        //3、对10求余
        for (int i = 0; i < ssr.length; i++) {
            ssr[i]=ssr[i] % 10;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.print(ssr[i]+",");
        }
        System.out.println();
        //4、所有数字反转
        for (int i = 0,  j= ssr.length-1; i < j; i++,j--) {
            int temp=ssr[i];
            ssr[i]=ssr[j];
            ssr[j]=temp;
        }
        for (int i = 0; i < ssr.length; i++) {
            System.out.print(ssr[i]);
        }
        System.out.println();
        //5、得到新数字
        int ssa=0;
        for (int i = 0; i < ssr.length; i++) {
            ssa=ssa*10+ssr[i];
        }
        System.out.println(ssa);

        //解密
        //2、将数字放入数组
        //获取数字的位数
        int b=ssa;
        int count1=0;
        while (b!=0){
            b=b/10;
            count1++;
        }
        int[] ssr2=new int[count1];

        while (ssa!=0){
            ssr2[count1-1]=ssa % 10;
            ssa=ssa/10;
            count1--;
        }
        for (int i = 0; i < ssr2.length; i++) {
            System.out.print(ssr2[i]+",");
        }
        System.out.println();
        //翻转
        for (int i = 0,  j= ssr2.length-1; i < j; i++,j--) {
            int temp=ssr2[i];
            ssr2[i]=ssr2[j];
            ssr2[j]=temp;
        }
        for (int i = 0; i < ssr2.length; i++) {
            System.out.print(ssr2[i]+",");
        }
        System.out.println();
        //获取余前值
        for (int i = 0; i < ssr2.length; i++) {
            if (ssr2[i]>=0&&ssr2[i]<=4) {
                ssr2[i]=ssr2[i]+10;
            }
        }
        for (int i = 0; i < ssr2.length; i++) {
            System.out.print(ssr2[i]+",");
        }
        System.out.println();
        //+5
        for (int i = 0; i < ssr2.length; i++) {
            ssr2[i]=ssr2[i]-5;
        }

    }
}
