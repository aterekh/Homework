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
public class Task5 {
    public static void main(String[] args) {
        int [][] array = new int [20][20];
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                array[i][j]=(int)(Math.random()*50);
            }
        }
        directArray(array);
        reverseArray(array);
        eventNumbered(array);
        notEventNumbered(array);
        sumOf7(array);
        multiplicationOf3(array);   
    }
    
    public static void directArray(int[][] array){
        System.out.println("Прямой порядок:");
        for (int[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array1[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void reverseArray(int[][] array){
        System.out.println("Обратный порядок:");
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = array[0].length - 1; j >= 0; j--){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void eventNumbered(int[][] array){
        System.out.println("Четные элементы: ");
        for (int i = 0; i < array.length; i++){
            if (i %2 == 0){
                System.out.println("Строка " + i + ": ");
                for (int j = 0; j < array[0].length; j++){
                    if (array[i][j] %2 ==0){
                        System.out.print(array[i][j] + " ");
                    }    
                }
                System.out.println();
            }
        }
    }
    
    public static void notEventNumbered(int [][] array){
        System.out.println("Нечетные элементы: ");
        for (int j = 0; j < array[0].length; j++){
            if (j %2 != 0){
                System.out.println("Cтолбец " + j + ": ");
                for (int[] array1 : array) {
                    if (array1[j] % 2 != 0) {
                        System.out.print(array1[j] + " ");
                    }
                }
                System.out.println();
            }    
        }
    }
    
    public static void sumOf7(int [][] array){
        int sum7 = 0;
        for (int i = 0; i < array.length; i++){
            if (i %2 == 0){
                for (int j = 0; j < array[0].length; j++){
                    if (array[i][j] %7 == 0){
                        sum7 += array[i][j];
                    }
                }
            }    
        }
        System.out.println("Сумма всех элементов, кратных 7, в четных строках: " + sum7);
        System.out.println();
    }
    
    public static void multiplicationOf3(int [][] array){
        int multiplication3 = 0;
        for (int i=0; i<array.length; i++){
            if (i%2!=0){
                multiplication3 = 1;
                for (int j=0; j<array[0].length; j++){
                    if (array[i][j] %3 == 0 && array [i][j] != 0){
                        multiplication3 *= array[i][j];
                    }
                }
            }    
        }
        System.out.println("Произведение всех элементов, кратных 3, в нечетных строках: " + multiplication3);
    }
    
}
