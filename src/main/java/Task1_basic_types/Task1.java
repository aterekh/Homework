/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_basic_types;

/**
 *
 * @author Alina
 */
public class Task1 {
    public static void main(String[] args) {
        
        String s = "\"Я люблю\"\nRock`n`Roll";
        String patronymic = "Игоревич";
        String name = "Андрей";
        String surname = "Терех";
        String id_group = "jv";
        String space = " ";
        int group_number = 1605;
        System.out.println("Здраствуй мир");
        System.out.println(s);
        System.out.println("ФИО:" + space + surname + space + name + space + patronymic);
        System.out.println("номер группы:" + space + id_group + space + group_number);
        System.out.println("Время занятий: 19:00");
    }
}
