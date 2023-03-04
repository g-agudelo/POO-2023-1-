public class Punto3 {
    public static void main(String[] args) throws Exception {
        int horas,salariohora,salario,dian,salarioneto;
        horas=48;
        salariohora=5000;
        salario=horas*salariohora;
        dian=salario/8;
        salarioneto=salario-dian;
        System.out.println("El salario bruto es:"+salario);
        System.out.println("La retencion en al fuente es:"+dian);
        System.out.println("El salario neto para el trabajador:"+salarioneto);
    }
}
