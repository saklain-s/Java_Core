/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamda;

@FunctionalInterface
interface Mylamda{
    public void display();
}
public class Lamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mylamda m = () ->
        {
            System.out.println("Hello world");
        };
        m.display();
    }
    
}
