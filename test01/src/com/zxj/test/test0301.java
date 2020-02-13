package com.zxj.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test0301 {
    public static void printLots(List<String> L,List<Integer> P){
        Iterator<String> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();

        String itemL= null;
        Integer itemP=0;
        int start = 0;

        while (iterL.hasNext()&&iterP.hasNext()){
            itemP = iterP.next();

            System.out.println("looking for position"+itemP);
            while (start<itemP&&iterL.hasNext()){
                start++;
                itemL = iterL.next();
            }
            System.out.println(itemL);
        }
    }

    public static void main(String[] args) {
        List<String> L=new ArrayList<>();
        List<Integer> P = new ArrayList<>();
        System.out.println("**********请输入 L************");
        for(int i=0;i<6;i++){
            Scanner in = new Scanner(System.in);
            String l=in.next();
            L.add(l);
        }
        System.out.println("**********请输入 P************");
        for(int i=0;i<3;i++){
            Scanner in = new Scanner(System.in);
            Integer p=Integer.parseInt(in.next());
            P.add(p);
        }
        printLots(L,P);
    }
}
