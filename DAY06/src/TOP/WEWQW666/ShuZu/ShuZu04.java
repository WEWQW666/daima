package TOP.WEWQW666.ShuZu;

public class ShuZu04 {
    public static void main(String[] args) {
        //定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        //遍历数组得到每一个元素。
        //要求：
        //1,如果是奇数，则将当前数字扩大两倍
        //2,如果是偶数，则将当前数字变成二分之一

        //1定义数组
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        //2开始遍历
        for (int i = 0; i < arr1.length; i++) {
            //判断当前遍历的数字是奇数还是偶数
            if (arr1[i]%2 == 0) {
                //偶数输出并变成二分之一
                System.out.println(arr1[i]/2);
            }else {
                //奇数扩大2倍
                System.out.println(arr1[i]*2);
            }
        }
    }
}
