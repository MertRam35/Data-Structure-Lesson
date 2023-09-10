package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {

    public static void main(String[] args) {

        Deque<Integer> cStack =new LinkedList<>();

        cStack.addFirst(1);
        cStack.addFirst(2);
        cStack.push(7);
        System.out.println(cStack.peek());
        cStack.pop();
        System.out.println(cStack.peek());


    }


}
