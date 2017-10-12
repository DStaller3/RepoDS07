import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Area {
    public static void main(String[] args) {
        System.out.println("Area de un triangulo");
        System.out.println("Ingrese la base del triangulo");
        Scanner sc1=new Scanner(System.in);
        int base=sc1.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        Scanner sc2=new Scanner(System.in);
        int altu=sc2.nextInt(); 
        System.out.println("El area del triangulo de base "+base+" y de altura "+altu+" es igual a "+(base*altu*0.5));
        // TODO code application logic here
    }
}