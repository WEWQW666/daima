package TOP.WEWQW666.FangFa;

public class FangFa08 {
    public static void main(String[] args) {
        //数组遍历
        //需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]
        //定义数组
        int[] arr1={11,22,33,44,55};
        //将数组传给方法
        PrintArr(arr1);


    }

    //定义方法用与数组的遍历
    //1、我要干嘛   遍历数组
    //2、我需要什么  数组
    //3、方法的调用需要返回值吗  不需要
    public static void PrintArr(int[] arr){
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]+"，");
            }
        }
        System.out.println("]");
    }
}
