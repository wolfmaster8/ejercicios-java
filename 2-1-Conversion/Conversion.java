
/**
 * Write a description of class Conversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Conversion
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double medida;
        
        System.out.println("-----Conversión de Unidades a Pulgadas-----");
        System.out.println("Ingresa: \n P: Para convertir Pies \n C: Para convertir Centímetros \n L: Para convertir Leguas \n Y: Para convertir Yardas");
        String tipoMedida = entradaOpciones(entrada);
        //int errorOpc = errorOpciones(tipoMedida);
        
        while(!tipoMedida.equals("P") || !tipoMedida.equals("C") || !tipoMedida.equals("L") || !tipoMedida.equals("Y")){
            System.out.println("Intenta de nuevo");
            tipoMedida = entradaOpciones(entrada);
            //errorOpc = errorOpciones(tipoMedida);
            //System.out.println(errorOpc);
        }
        System.out.println("Listo");
    }
    
    public static int errorOpciones(String tipoMedida){
        if(tipoMedida == "P" || tipoMedida == "C" || tipoMedida == "L" || tipoMedida == "Y"){
            System.out.println("Diu certo");
            return 1;
        }else{
            System.out.println("error");
            return 0;
        }
        
    }
    
    public static String entradaOpciones(Scanner entrada){
        String tipoMedida;
        tipoMedida= entrada.next().toUpperCase();
        // elimina los carácteres en blanco
        tipoMedida = tipoMedida.trim();
        //System.out.println(tipoMedida.getClass().getName());
        
        return tipoMedida;
    }
}
