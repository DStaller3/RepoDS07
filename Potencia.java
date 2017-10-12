import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Potencia {
    public static void main(String[] args) {
        System.out.println("Potencia");
        System.out.println("Ingrese la base");
        Scanner sc1=new Scanner(System.in);
        int base=sc1.nextInt();
        System.out.println("Ingrese el exponente");
        Scanner sc2=new Scanner(System.in);
        int expo=sc2.nextInt();
        int res=(int) Math.pow(base, expo);
        System.out.println(base+" elevado a la "+expo+" es igual a "+res);
        // TODO code application logic here
    }
}
