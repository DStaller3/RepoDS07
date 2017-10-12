/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        double  a = input.nextInt();
        System.out.println("ingrese un segundo numero");
        double  b = input.nextInt();
        System.out.println("el resultado es:"+(a+b));
        
    }
    
}
