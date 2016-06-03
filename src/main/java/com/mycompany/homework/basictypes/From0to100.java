/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework.basictypes;

/**
 *
 * @author Alina
 */
public class From0to100 {
    public static void main(String[] args) {
        int multiple_2; 
        int multiple_3; 
        int multiple_5; 
        int multiple_7;
        int sum_2 = 0;
        int sum_3 = 0;
        int sum_5 = 0;
        int sum_7 = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                 if (i%2 == 0){
                    sum_2 += i;
                    System.out.println("Кратное 2 - " + i); }                  
                if (i%3 == 0){
                    sum_3 += i;
                    System.out.println("Кратное 3 - " +i);}
                if (i%5 == 0){
                    sum_5 += i;
                    System.out.println("Кратное 5 - " +i); }
                if (i%7 == 0){
                    sum_7 += i;
                    System.out.println("Кратное 7 - " +i); }
                }
                /*if (i % 2 == 0){
                sum_2 += i;
                System.out.println(i + " ");
                }
                }
                if (i % 3 == 0){
                sum_3 += i;
                System.out.println(i + " ");
                }
                if (i % 5 == 0){
                sum_5 += i;
                System.out.println(i + " ");
                }
                if (i % 7 == 0){
                sum_7 += i;
                System.out.println(i + " ");
                }*/
            }
        
        System.out.println("Сумма элементов кратных 2 - " + sum_2);
        System.out.println("Сумма элементов кратных 3 - " + sum_3);
        System.out.println("Сумма элементов кратных 5 - " + sum_5);
        System.out.println("Сумма элементов кратных 7 - " + sum_7);
    }
    
}

