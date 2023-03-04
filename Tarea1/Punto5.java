import java.util.Scanner;
public class Punto5 {
    public static void main(String[] args) throws Exception {
        float radio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio= entrada.nextFloat();
        System.out.println("El area del circulo es:"+(Math.PI*radio*radio));
        System.out.println("la circunferencia del circulo es:"+(Math.PI*radio*2));

    }
}
