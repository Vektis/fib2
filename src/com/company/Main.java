package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
       System.out.println("enter a number: ");
        double n = input.nextDouble();
        for (int i = 0; i < 43; i++) {
            try{
                if(n==fib.onnaci(i)){
                    System.out.println("It's a fibonnachi number");
                    System.out.println("The following sequence was:");
                    for (int j = 0; j < i+1; j++) {
                        System.out.print((int)fib.onnaci(j)+",");
                    }
                    return;
                }
            }
            catch(StackOverflowError e){
                System.out.println("It's not a fibonnachi number");
                return;
            }
           // System.out.print(i+",");

        }
        System.out.println("its not a fibonnachi number");


    }
}
