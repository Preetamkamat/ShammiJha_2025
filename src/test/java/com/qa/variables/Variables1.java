package com.qa.variables;

public class Variables1 {

    static int a = 10;

    public static void main(String[] args) {
        System.out.println(a);
        Variables1 var1 = new Variables1();
        var1.test1();

    }

    public void test1(){
        // local variables
        float b = 4.5f;
        System.out.println(b);
    }
}
