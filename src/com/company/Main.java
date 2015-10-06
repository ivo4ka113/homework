package com.company;

public class Main {

    public static void main(String[] args) {
	int a =123456;
        int b=0;
        while(a != 0){
            b = b + (a % 10);
            a=10;
        }
        System.out.println(b);

    }
}
