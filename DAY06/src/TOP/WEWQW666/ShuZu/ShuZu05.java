package TOP.WEWQW666.ShuZu;

public class ShuZu05 {
    public static void main(String[] args) {
        //求最值
        //需求：已知数组元素为{33,5,22,44,55}
        //请找出数组中最大值并打印在控制台
        //定义数组
        //扩展问题：
//1.根据求最大值的思路，自己改写一下求最小智
//2.为什么max要记录为arr[g],默认值不能为0吗？
//不能写0
//max的初始化值一定要是数组中的值。
//13.循环中开始条件一定是0吗？
//循环的开始条件如果为©，那么第一次循环的时候是自己跟自己比了一下，对结果没有任何影响，但是效率偏低
//1为了提高效率，减少一次循环的次数，循环开始条件可以写1.
        int[] arr1={33,5,22,44,55};
        //定义变量接收最值
        int a=arr1[0];
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] <a ){
                a=arr1[i];
            }
        }
        System.out.println(a);
    }
}
