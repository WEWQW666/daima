package TOP.WEWQW666.FangFa;

public class FangFa11 {
    public static void main(String[] args) {
        //需求：
        //定义一个方法copyOfRange(int[arr,int from,int to)
        //功能：
        //将数组arr中从索引from(包含from)开始。
        //到索引to结束(不包含to)的元素复制到新数组中，
        //将新数组返回。

        //定义数组
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //定义变量 int from,int to
        int from=2;
        int to=8;
        //获取回传的数组
        int[] arr3=CopyArray(arr,from,to);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }

    }
    //1、需要做什么？  将两个变量之间的数组中间的数复制到一个新的数组中并回传
    //2、需要什么？  数组，两个变量
    //3、需要回传吗  需要
    public static int[] CopyArray(int[] arr,int from,int to){
        //定义变量存from与to之间的索引长度
        int a=0;
        int b=0;
        int c;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==from) {
                a=i;
            }else if (arr[i]==to){
                b=i;
            }

        }

        c=b-a+1;

        //根据上方长度的计算得出数组的长度
        int[] arr2=new int[c];
        //将值复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            if (i >= a&&i<=b) {

                arr2[i-a]=arr[i];
            }
        }
        return arr2;



    }
}
