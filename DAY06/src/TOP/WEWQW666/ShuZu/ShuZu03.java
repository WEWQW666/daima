package TOP.WEWQW666.ShuZu;

public class ShuZu03 {
    public static void main(String[] args) {
        //定义一个数组，
        //存储1,2,3,4,5,6,78,9,10
        //遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
        //1定义一个数组
        int[] a={1,2,3,4,5,6,7,8,9,10};
        //2定义一个变量记录被3整除数字的数量
        int b=0;
        //开始遍历
        for (int i = 0; i < a.length; i++) {
            //判断是否能整除，能的话+1，不能直接跳过开始下一个循环
            if (a[i]%3!=0) {
                continue;

            }else if (a[i]%3==0) {
                b++;
            }
        }
        //循环后将获取到的数量输出
        System.out.println("数量为"+b);

    }
}
