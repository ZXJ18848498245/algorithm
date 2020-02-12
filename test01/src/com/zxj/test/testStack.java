package com.zxj.test;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class testStack {
    private int top;  //栈顶，表示栈顶元素下标
    private int size;  //表示栈中元素的个数
    private int length; //栈的容量
    private List listStack =new ArrayList(); //作为栈容器
    /*无参构造*/
    public testStack(){
        this.top=-1;
        this.size=0;
        this.length=10;
    }
    /*有参构造*/
    public  testStack(int length){
        super();
        this.top=-1;
        this.size=0;
        this.length=length;
        if(length<=0){
            this.length=10;
        }
    }
    /*入栈方法*/
    public boolean push(int t){
        //判断栈满
        if(size>=length){
            return false;
        }
        else {
            top++;
            listStack.add(t);
            size++;
            return true;
        }
    }
    /*出栈方法*/
    public int pop(){
        //判断栈空
        if(size==0){
            return Integer.parseInt(null);
        }
        else {
            int t= (int) listStack.get(top);
            top--;
            size--;
            return t;
        }
    }
    /*查看栈顶元素*/
    public Boolean peek(){
        //判断栈空
        if(size==0){
            return false;
        }
        else {
            int t= (int) listStack.get(top);
            System.out.println(t);
            return true;
        }
    }
    /*查看栈中元素个数*/
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        testStack stack =new testStack();
        //进栈
        System.out.println("**********进栈***********");
        Scanner in = new Scanner(System.in);
        for(int j=3;j>0;j--){
             int i = in.nextInt();
             stack.push(i);
        }
        System.out.println("栈内元素："+ stack.size());
        /*看栈顶*/
        System.out.println("栈顶：");
        stack.peek();

        //出栈
        System.out.println("*******************出栈**************");
        System.out.println("出栈："+ stack.pop());
        System.out.println("栈内元素："+stack.size());
        System.out.println("栈顶：");
        stack.peek();


    }

}
