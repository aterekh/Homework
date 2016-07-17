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
public class Task2 {
    public static void main(String[] args) {
        
        String textNumber = ""; 
        String buffer = "";
        char changedData = ' ';
        int number = (int)(Math.random()*99);
       
        buffer += number;
        if(buffer.length() > 1 && buffer.charAt(0) == '1'){ 
            switch (buffer.charAt(1)){
                case '0':
                    textNumber += "десять";
                    break;
                case '1':
                    textNumber += "одиннадцать";
                    break;
                case '2':
                    textNumber += "двенадцать";
                    break;
                case '3':
                    textNumber += "тринадцать";
                    break;
                case '4':
                    textNumber += "четырнадцать";
                    break;
                case '5':
                    textNumber += "пятнадцать";
                    break;
                case '6':
                    textNumber += "шестнадцать";
                    break;
                case '7':
                    textNumber += "семнадцать";
                    break;
                case '8':
                    textNumber += "восемнадцать";
                    break;
                case '9':
                    textNumber += "девятнадцать";
                    break;
            }
        } else {
            if(buffer.length() > 1){
                switch(buffer.charAt(0)){
                    case '2':
                        textNumber += "двадцать ";
                        changedData=buffer.charAt(1);
                        break;
                    case '3':
                        textNumber += "тридцать ";
                        changedData=buffer.charAt(1);
                        break;
                    case '4':
                        textNumber += "сорок ";
                        changedData=buffer.charAt(1);
                        break;
                    case '5':
                        textNumber += "пятьдесят ";
                        changedData=buffer.charAt(1);
                        break;
                    case '6':
                        textNumber += "шестьдесят ";
                        changedData=buffer.charAt(1);
                        break;
                    case '7':
                        textNumber += "семьдесят ";
                        changedData=buffer.charAt(1);
                        break;
                    case '8':
                        textNumber += "восемьдесят ";
                        changedData=buffer.charAt(1);
                        break;
                    case '9':
                        textNumber += "девяносто ";
                        changedData=buffer.charAt(1);
                        break;    
                }
            } else {
                changedData=buffer.charAt(0);
            }
            switch (changedData){
                case '0':
                    if (buffer.length() == 1){
                        textNumber = "ноль";
                    }    
                    break;
                case '1':
                    textNumber += "один";
                    break;
                case '2':
                    textNumber += "два";
                    break;
                case '3':
                    textNumber += "три";
                    break;
                case '4':
                    textNumber += "четыре";
                    break;
                case '5':
                    textNumber += "пять";
                    break;
                case '6':
                    textNumber += "шесть";
                    break;
                case '7':
                    textNumber += "семь";
                    break;
                case '8':
                    textNumber += "восемь";
                    break;
                case '9':
                    textNumber += "девять";
                    break;    
            }
        }
        System.out.println(number);
        System.out.println(textNumber);     
    }
}
