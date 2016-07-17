/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_main_constructions;

/**
 *
 * @author Alina
 */
public class Task4 {
     public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++){
            array[i]=(int)(Math.random()*20);
        }
        
      directArray(array);
      reverseArray(array);
      eventNumbered(array);
      notEventNumbered(array);
      sumOf7(array);
      multiplicationOf3(array);
        
    }
    
    public static void directArray(int [] array){
        System.out.println("Прямой порядок:");
        for (int i = 0; i < array.length; i++){
            System.out.println(i + "-" + array[i]);
        }
        System.out.println("");
    }
    
    public static void reverseArray(int [] array){
        System.out.println("Обратный порядок:");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(i + "-" + array[i]);
        }
        System.out.println("");
    }
    
    public static void eventNumbered(int [] array){
        System.out.println("Четные:");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
            System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }
    
    public static void notEventNumbered(int [] array){
        System.out.println("Нечетные:");
        for (int i = 0; i < array.length; i++){
            if (array[i] %2 == 0){
             System.out.print(array[i] + " ");   
            }  
        }
        System.out.println("");
    }
    
    public static void sumOf7(int [] array){
        int sum7 = 0;
        for (int i = 0; i < array.length; i++){
            if (array [i] % 7 == 0){
                sum7 += array[i];
            }
        }
        System.out.println("Сумма элементов, кратных 7: " + sum7);
        System.out.println("");
    }
    
    public static void multiplicationOf3(int [] array){
        int multiplication3 = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] %3 == 0 && array[i] != 0){
                multiplication3 *= array[i];
            }
        }
        System.out.println("Произведение элементов, кратных 3: " + multiplication3);
    }  
}
