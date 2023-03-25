package TOP.WEWQW666.ShuZu;

public class ShuZU07 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
        //交换前：1,2,3,4,5
        //交换后：5,2,3,4,1

        //定义一个数组
        int[] arr1={1,2,3,4,5};
        //进行交换并打印
        int[] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                arr2[i]=arr1.length;
            }else if (i == arr1.length-1) {
                arr2[i]=arr1[0];
            }else {
                arr2[i]=arr1[i];
            }
            System.out.println(arr2[i]);
        }


    }
}
