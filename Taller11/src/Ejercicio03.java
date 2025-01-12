import java.util.Scanner;
public class Ejercicio03 {
    static double nota1, nota2, nota3, nota4;
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        System.out.println("INGRESE SU NOTA 1");
        nota1 = tcl.nextDouble();
        System.out.println("INGRESE SU NOTA 2");
        nota2 = tcl.nextDouble();        
        System.out.println("INGRESE SU NOTA 3");
        nota3 = tcl.nextDouble();        
        System.out.println("INGRESE SU NOTA 4");
        nota4 = tcl.nextDouble();       
        verificacion();
        System.out.println("SU PROMEDIO ES: " + generarPromedio(nota1, nota2, nota3, nota4) + " pts " + "SU PROMEDIO ES " + mostrarCalificacion(nota1, nota2, nota3, nota4));
    }
    public static void verificacion (){
        if (nota1 > 10) 
            nota1 = 10;
        else if (nota1 < 0)
            nota1 = 0;
        if (nota2 > 10) 
            nota2 = 10;
        else if (nota2 < 0)
            nota2 = 0;
        if (nota3 > 10) 
            nota3 = 10;
        else if (nota3 < 0)
            nota3 = 0;
        if (nota4 > 10) 
            nota4 = 10;
        else if (nota4 < 0)
            nota4 = 0;        
    }
    public static String mostrarCalificacion (double nota1, double nota2, double nota3, double nota4){
        String calificacion = ""; 
        double promedio = generarPromedio(nota1, nota2, nota3, nota4);
        if (promedio <= 5)
            calificacion = "REGULAR";
        else if (promedio <= 8)
            calificacion = "BUENO";
        else if (promedio <= 9)
            calificacion = "MUY BUENO";
        else
            calificacion = "SOBRESALIENTE";
        return calificacion;
    }    
    public static double generarPromedio (double nota1, double nota2, double nota3, double nota4){
        return ((nota1 + nota2 + nota3 + nota4) / 4);
    }            
}
