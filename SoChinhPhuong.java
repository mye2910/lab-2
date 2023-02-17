/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SoChinhPhuong 
        {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số cần kiểm tra:");
        double num;
        try (Scanner Scanner = new Scanner ( System.in)) {
            num = Scanner.nextDouble();
        }
        if (checkPerfectSquare(num))
            System.out.println(num+ " Là số chính phương");
        else
            System.out.println(num+ " Không phải là số chính phương");
    }
} 
    
    

