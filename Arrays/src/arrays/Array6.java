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
public class Array6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[]=new int [10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        int n=6;
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
        int x = 20;
        int index =2;
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
         for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
    
}
}