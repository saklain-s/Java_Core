/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopspractice;
import java.util.*;
/**
 *
 * @author User
 */
public class reversenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,r;
       
        while(num>0)
        {
            r = num % 10;
            rev = rev*10+r;
            num/=10;
            
        }
        
        System.out.println(rev);
        
        
    }
    
}
