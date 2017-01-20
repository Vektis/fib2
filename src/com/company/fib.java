package com.company;

/**
 * Created by vianrosal on 1/19/17.
 */
public class fib {
    public fib(){

    }
    public static double onnaci(double n){
        if(n == 0){
            return 0;
        }
        if (n <= 2){
            return 1;
        }
        else{
            return(onnaci(n-1) + onnaci(n-2));
        }
    }
}
