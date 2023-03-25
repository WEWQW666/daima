package com.wewqw666.xuexi;

public class SsysDemo4 {
    public static void main(String[] args) {
        int a=10;
        a++;
        System.out.println(a);

        int x=10;
        int y=x++;
        int z=++x;
        System.out.println("x="+x);//12
        System.out.println("y="+y);//10
        System.out.println("z="+z);//12

        int aa=4;
        int bb=6;
        aa+=bb;
        System.out.println(aa);

    }

    public void test(){

    }
}


