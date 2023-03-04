import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) throws Exception {
        float EdadJuan,EdadAlberto,EdadAna,EdadMamaJuan;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la edad de juan");
        EdadJuan= entrada.nextFloat();
        EdadAlberto=(EdadJuan*2)/3;
        EdadAna=(EdadJuan*4)/3;
        EdadMamaJuan=EdadAlberto+EdadJuan+EdadAna;
        EdadJuan=Math.round(EdadJuan);
        EdadAna=Math.round(EdadAna);
        EdadAlberto=Math.round(EdadAlberto);
        EdadMamaJuan=Math.round(EdadMamaJuan);
        System.out.println("La edad de Juan es:"+EdadJuan);
        System.out.println("La edad de Alberto es:"+EdadAlberto);
        System.out.println("La edad de Ana es:"+EdadAna);
        System.out.println("La edad de Mama Juan es:"+EdadMamaJuan); 
    }
}
