/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalang;


public class string_buffer_builder 
{
    public static void main(String[] args) 
    {
        String s1 = new String("Hello");
        
        StringBuffer s2=new StringBuffer("Hello");
        
        StringBuilder s3=new StringBuilder("Hello");
        
        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }   
}