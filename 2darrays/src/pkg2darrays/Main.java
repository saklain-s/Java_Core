/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darrays;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int c[][] = new int[3][3];
        for(int i=0;i<A.length;i++)
        {
            for(int j =0;j<B.length;j++)
            {
               c[i][j]=0;
               for(int k=0;k<3;k++)
               {
                   c[i][j]=c[i][j]+A[i][k]*B[k][j];
                   System.out.print(c[i][j]+" ");
               }
               System.out.println();
            }
          
        }
        
        
    }
    
}
