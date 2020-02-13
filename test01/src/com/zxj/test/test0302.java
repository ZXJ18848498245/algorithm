package com.zxj.test;

import org.w3c.dom.Node;

import java.util.List;

public class test0302 {
    public static void swapWithNext(ListNode beforeP){
        ListNode p,afterp;
        p=beforeP.next;

        p=beforeP.next;
        afterp=p.next;

        afterp.next=p.next;
        beforeP.next=afterp;
        afterp.next=p;
    }

    public static void swapWthNext2(ListNode p){
        ListNode beforep,afterp;

        beforep=p.prev;
        afterp=p.next;

        p.next=afterp.next;
        beforep.next = afterp;
        afterp.next=p;
        p.next.prev=p;
        p.prev =afterp;
        afterp.prev = beforep;

    }
}
