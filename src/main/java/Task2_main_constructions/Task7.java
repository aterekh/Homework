/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_main_constructions;
import java.util.Scanner;
/**
 *
 * @author Alina
 */
public class Task7 {
      public static void main(String[] args) {
        int m, n;
        System.out.println("Введите количество строк массива: ");
        Scanner con = new Scanner(System.in);
        n = con.nextInt();
        System.out.println("Введите количество столбцов массива :");
        m = con.nextInt();
        int [][] array = new int [n] [m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j]=(int)(Math.random()*20);
            }
        }
      }
}
      
      
