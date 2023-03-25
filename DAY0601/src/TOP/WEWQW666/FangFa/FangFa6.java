package TOP.WEWQW666.FangFa;

public class FangFa6 {
    public static void main(String[] args) {
        //目标：掌握带返回值方法的定义和格式调用

        add1(22,12,12);
        double x1=add1(22,12,12);
        double x2=add1(12,13,14);
        double x3=add1(12,13,14);
        double x4=add1(12,13,14);

        //全年
        double b=x1+x2+x3+x4;
        System.out.println(b);

    }
    //第一季度
    public static double add1(double a1,double a2, double a3){
        double c=a1+a2+a3;
        return c;
    }
}
