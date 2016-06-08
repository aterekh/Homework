/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_basic_types;
import java.lang.Math.*;
import java.util.Scanner;

/**
 *
 */
public class Task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        final double Math.PI = 3.14;
        
        System.out.print("Введите радиус большей окружности: " ); 
        double r_big = in.nextDouble();
        System.out.print("Введите радиус меньшей окружности: " ); 
        double r_little = in.nextDouble();
        double l_big_circle = 2*r_big*Math.PI;
        double s_big_circle = Math.PI*Math.pow(r_big, 2);
        double s_ring = Math.PI*(Math.pow(r_big, 2)-Math.pow(r_little, 2));
        System.out.println("Длина большей окружности равна: " + l_big_circle);
        System.out.println("Площадь большей окружности равна: " + s_big_circle);
        System.out.println("Площадь кольца равна: " + s_ring);
        
        System.out.println("Введите длины сторон треугольника: " ); 
        double a_triangle = in.nextDouble();
        double b_triangle = in.nextDouble();
        double c_triangle = in.nextDouble();
        double p_triangle = a_triangle + b_triangle + c_triangle;
        double half_p_triangle = p_triangle/2;
        double s_triangle = Math.sqrt(half_p_triangle*(half_p_triangle-a_triangle)*(half_p_triangle-b_triangle)*(half_p_triangle-c_triangle));
        System.out.println("Периметр треугольника равен: " + p_triangle);
        System.out.println("Площадь треугольника равна: " + s_triangle);
        
        System.out.println("Введите длины сторон прямоугольника: " ); 
        double a_rectangle = in.nextDouble();
        double b_rectangle = in.nextDouble();
        double p_rectangle = 2*(a_rectangle + b_rectangle);
        double s_rectangle = a_rectangle*b_rectangle;
        System.out.println("Периметр прямоугольника равен: " + p_rectangle);
        System.out.println("Площадь прямоугольника равна: " + s_rectangle);
        
        System.out.println("Ведите высоту цилиндра: ");
        double height_cylinder = in.nextDouble();
        double v_cylinder = Math.PI*Math.pow(r_big, 2)*height_cylinder;
        double v_hollow_cylinder = Math.PI*height_cylinder*(Math.pow(r_big, 2)-Math.pow(r_little, 2));
        double lateral_surface_cylinder = 2*Math.PI*r_big*height_cylinder;
        System.out.println("Объем цилиндра равен: " + v_cylinder);
        System.out.println("Объем полого цилиндра равен: " + v_hollow_cylinder);
        System.out.println("Площадь боковой поверхности цилиндра равна: " + lateral_surface_cylinder);
        
        double s_sphere = 4*Math.PI*Math.pow(r_big, 2);
        double v_sphere = (4/3)*Math.PI*Math.pow(r_big, 3);
        System.out.println("Объем шара: " + v_sphere);
        System.out.println("Площадь шара: " + s_sphere);
        
        System.out.println("Ведите высоту параллелепипеда: ");
        double с_rectangle = in.nextDouble();
        double s_parallelepiped = 2*(a_rectangle*b_rectangle + a_rectangle*с_rectangle + b_rectangle*с_rectangle);
        double v_parallelepiped = a_rectangle*b_rectangle*с_rectangle;
        System.out.println("Объем параллелепипеда: " + v_parallelepiped);
        System.out.println("Площадь параллелепипеда: " + s_parallelepiped);
        
        double s_tetrahedron = Math.pow(a_triangle, 2)*Math.sqrt(3);
        double v_tetrahedron = Math.pow(a_triangle, 3)*Math.sqrt(2)/12;
        System.out.println("Объем тетраэдера со стороной a: " + v_tetrahedron);
        System.out.println("Площадь тетраэдера со стороной a: " + s_tetrahedron);
    }
}
