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
public class sumnnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
            
        }
        System.out.println(sum);
    }
    
}
