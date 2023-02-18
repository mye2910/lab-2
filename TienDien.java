/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendien;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TienDien {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = sc.nextInt();
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("Số tiền điện phải trả: " + tien + " VNĐ");
    }
}
    
    

