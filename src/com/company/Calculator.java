package com.company;


public class Calculator {
    private int a;
    private int b;
    private String p;

    public int addition(){
        return a + b;
    }
    public int subtraction(){
        return a - b;
    }
    public int multiplication(){
        return a * b;
    }
    public int division(){
        return a / b;
    }
    Calculator(int a, int b, String p){
        this.p = p;
        this.a = a;
        this.b = b;
    }
    public int calculation() {
        int i = 0;
        switch (p) {
            case "+":
                i = addition();
                break;
            case "-":
                i = subtraction();
                break;
            case "*":
                i = multiplication();
                break;
            case "/":
                i = division();
                break;
            default:
                System.out.println("throws Exception //т.к. не верно введен оператор");
                int k = 0;
                System.exit(k);
                break;
        }
        return i;
    }
}
