package TOP.WEWQW666.FangFa;

public class FangFa09 {
    public static void main(String[] args) {
        //需求：设计一个方法求数组的最大值，并将最大值返回
        //定义一个数组
        int[] arr={1,4,2,6,12,33,32};

        //获取方法返回值
        int Maximum=GetMax(arr);

        //打印
        System.out.println("最大值是"+Maximum);


    }

    //1、我要干嘛？ 求最大值
    //2、需要什么  数组
    //3、需要返回值吗？   需要

    public static int GetMax(int[] arr){
        int arr1=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr1) {
                arr1=arr[i];
            }
        }

        return arr1;
    }
}
