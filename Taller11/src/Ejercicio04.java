import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String clientenom, clienteap, cedula;
        int valorkw, kw, k =0, opcion;
        double valorinm;
        System.out.println("INGRESE SU NOMBRE Y APELLIDO: ");
        clientenom = tcl.next();
        clienteap = tcl.next();
        System.out.println("INGRESE LA CEDULA: ");
        cedula = tcl.next();
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("1. CALCULAR EL VALOR DE LA LUZ");
        System.out.println("2. CALCULAR PREDIO DE INMUEBLE");
        opcion = tcl.nextInt();
        while (k == 0) {            
            if (opcion == 1) {
                System.out.println("INGRESE EL VALOR POR KW: ");
                valorkw = tcl.nextInt();
                System.out.println("INGRESE LOS KW CONSUMIDOS: ");
                kw = tcl.nextInt();
                System.out.println("Cliente " + clientenom + clienteap + " con cédula " + cedula + " debe cancelar el valor de $" + calcularValorLuz(valorkw, kw));
                k = 1;
            }
            else if (opcion == 2){
                System.out.println("INGRESE EL VALOR DEL INMUEBLE: ");
                valorinm = tcl.nextDouble();
                System.out.println("Cliente " + clientenom + clienteap + " con cédula " + cedula + " tiene un bien inmueble valorado en $" + valorinm + " y tiene que pagar de predio $" + calcularPredio(valorinm));
                k = 1;
            }
            else
                System.out.println("SELECCIONE UNA OPCION CORRECTA");
        }
    }
    public static int calcularValorLuz (int valorkw, int kw){
        return (valorkw*kw);
    }
    public static int calcularPredio (double valorinm){
        return (int) (valorinm * 0.2);
    }
}
