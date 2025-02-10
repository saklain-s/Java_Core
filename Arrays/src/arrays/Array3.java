/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;
import java.util.*;
/**
 *
 * @author User
 */
public class Array3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int key ;
        key = sc.nextInt();
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println(+i);
                System.exit(0);
            }
            
        }
        
    }
    
}
