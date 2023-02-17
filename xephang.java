
package lab.pkg2;

import java.util.Scanner;
public class xephang {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
       Double score;
       System.out.print("nhập điểm: ");
       score = input.nextDouble ();
       {
           if (score >=8)
           System.out.print("gioi: ");
           else if ((score >=7) && (score <=8))
           System.out.print("kha: ");
           else if ((score >=5) && (score <=7))
           System.out.print("trungbinh: ");
           else 
           System.out.print("kem: ");
       }
}
}
    
    

