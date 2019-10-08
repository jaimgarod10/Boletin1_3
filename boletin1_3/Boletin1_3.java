
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {


    public static void main(String[] args) {
        // pasar euros a dolares
        Scanner sc= new Scanner(System.in);
        System.out.println("Euros: ");
        float euros= sc.nextFloat();
        System.out.println("Cambio: ");
        float cambio= sc.nextFloat();
        System.out.println(euros*cambio + " dolares");       
        
    }
    
}
