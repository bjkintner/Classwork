/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.exercisestudentquizscores;

/**
 *
 * @author bryantkintner
 */
public class Calculator {
    
    
    public int add(int x, int y){
        return x + y;
    }
    
    public int subtract(int x, int y){
        return x - y;
    }
    
    public int multiply(int x, int y){
        return x * y;
    }
    
    public int divide(int x, int y){
        return x / y;
    }
    
    public int sum(int [] x){
        int sum = 0;
        for (int y : x) {
            sum += y;
        }
            return sum;
    }
    
//    public double average(int [] x){
//        double average;
//        int sum = calc.sum(x);
//        double sumDouble = sum;
//        average = sumDouble / x.length;
//        return average;
//    }
}
