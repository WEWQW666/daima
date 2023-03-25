package TOP.WEWQW666.FangFa;

public class FangFa07 {
    //需求：定义方法，比较两个长方形的面积。
    public static void main(String[] args) {

        double a1=jisuan(12,13);
        double b1=jisuan(13,14);
        if (b1 >a1) {
            System.out.println("第二个长方形的面积大");
        }else {
            System.out.println("第二个长方形的面积大");
        }

    }

    //我要干嘛？
    //求长方形的周长
    //需要怎么干？
    //需要知道长宽相加
    public static double jisuan(double  len,double width){
        //定义一个变量c,存周长
        double c=(len+width)*2;
        System.out.println("周长为"+c);
        return c;
    }
}
