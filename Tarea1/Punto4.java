import java.util.Scanner;
public class Punto4 {
    public static void main(String[] args) throws Exception {
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero= entrada.nextFloat();
        System.out.println("El cuadrado del numero es:"+numero*numero);
        System.out.println("El cubo del numero es:"+numero*numero*numero);

    }
}
