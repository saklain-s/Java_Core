/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticandfinal;


class Test
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class staticblock {

    
    
    /*static
    {
        System.out.println("Block 1");
    }*/
    
    
    public static void main(String[] args) 
    {
        //Test t=new Test();
        System.out.println("Main");
        Test t=new Test();
    }
    
}   /*static
    {
    System.out.println("Block 2");
    }*/
    