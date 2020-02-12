package com.zxj.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testQueue {
    private int front;  //队首，表示队首下标
    private int rear; //队尾，表示队尾下标
    private int size;  //表示队列中元素的个数
    private int length; //队列的容量
    private List listQueue =new ArrayList(); //作为栈容器
    /*无参构造*/
    public testQueue(){
        this.front=0;
        this.rear = -1;
        this.size=0;
        this.length=10;
    }
    /*有参构造*/
    public  testQueue(int length){
        super();
        this.front=0;
        this.rear=-1;
        this.size=0;
        this.length=length;
        if(length<=0){
            this.length=10;
        }
    }
    /*入队方法*/
    public boolean add(int t){
        //判断栈满
        if(size>=length){
            return false;
        }
        else {
            rear++; //队尾下标加一
            listQueue.add(rear,t);
            size++;
            return true;
        }
    }
    /*出队方法*/
    public int offer(){
        //判断栈空
        if(size==0){
            return Integer.parseInt(null);
        }
        else {
            int t= (int) listQueue.get(front);
            if(front==rear){
                front=0;
                rear=-1;
                size=0;
                return t;
            }
            front++;
            size--;
            return t;
        }
    }
    /*查看队首元素*/
    public Boolean peek(){
        //判断栈空
        if(size==0){
            return false;
        }
        else {
            int t= (int) listQueue.get(front);
            System.out.println(t);
            return true;
        }
    }
    /*查看栈中元素个数*/
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        testQueue queue =new testQueue();
        //进栈
        System.out.println("**********进队***********");
        Scanner in = new Scanner(System.in);
        for(int j=3;j>0;j--){
            int i = in.nextInt();
            queue.add(i);
        }
        System.out.println("队内元素："+ queue.size());
        /*看栈顶*/
        System.out.println("队顶：");
        queue.peek();

        //出栈
        System.out.println("*******************出队**************");
        System.out.println("出队："+ queue.offer());
        System.out.println("队内元素："+queue.size());
        System.out.println("队顶：");
        queue.peek();


    }
}
