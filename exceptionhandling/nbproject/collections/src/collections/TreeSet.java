/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;


import java.util.*;

public class TreeSet {

    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        
        ts.add(25);
        
        //ts.ceiling(55);
        
        System.out.println(ts);
        
    }
    
}