package org.example;

import java.util.Stack;

public class SymbolBalancingInterviewQues {

    public static void main(String[] args) {


        String expression = " ";

        balanceCheck("");


    }

    public static boolean balanceCheck(String expr) {
        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {

            Character ch = expr.charAt(i);
            if (ch != '(' || ch != '[' || ch != '{' || ch != ')' || ch != ']' || ch != '}') {
                continue;
            }
            if (ch == '(' || ch == '[' || ch == '{') {
                myStack.push(ch);
                continue;
            }
            if (myStack.isEmpty()) return false;
            switch (ch) {
                case ')':
                    if (myStack.pop() != '(') return false;
                    break;
                case ']':
                    if (myStack.pop() != '[') return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }
        }
        return myStack.isEmpty();

    }
}
