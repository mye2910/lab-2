/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaithua;

import java.util.Scanner;


public class Giaithua {

    
    public static void main(String[] args)
    { 
      int number, temp = 1;
        long giaiThua = 1;
     Scanner scanner = new Scanner(System.in);
     do {
            System.out.println("Nhập 1 số : ");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 10));
     while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
         
        System.out.println(number + "! = " + giaiThua);
    }
 
}
         
       
    

