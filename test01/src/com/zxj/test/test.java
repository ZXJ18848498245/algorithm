package com.zxj.test;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
//选择问题
public class test {
    //构建随机数数组
    public  static  int[] RandomArray(int i){
        int arr[]=new int[i];
        for(int j=0;j<i;j++){
            int temp=(int)(Math.random()*1000)+1;
            arr[j]=temp;
        }
        for(int array:arr){
            System.out.print(array+" ");
        }
        return arr;
    }

    //排序
    public static  void BubbleSort(int arr[],int k){
        int temp=0;
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        for(int array:arr){
            System.out.print(array+" ");
        }
        System.out.println();
        System.out.println(arr[k]);

    }

    public static void main(String[] args) {

        System.out.println("输入生成随机数组大小");
        Scanner in= new Scanner(System.in);
        int i=in.nextInt();
        long strarttimes=System.currentTimeMillis();
        int arr[] =new int[i];
        int arr2[]=new int[i];
        int k=i/2;
        arr=RandomArray(i);
        System.out.println();
        BubbleSort(arr,k);
        long endtimes=System.currentTimeMillis();
        long time=endtimes-strarttimes;
        System.out.println("执行时间："+time);


    }
}
