
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

        System.out.println("-----Conversión de Unidades a Pulgadas-----");
        System.out.println("Ingresa: \n P: Para convertir Pies \n C: Para convertir Centímetros \n L: Para convertir Leguas \n Y: Para convertir Yardas");
        String tipoMedida = entradaOpciones(entrada);
        //int errorOpc = errorOpciones(tipoMedida);
        
        switch(tipoMedida){
            case "P":
                System.out.println("P - Pies");
                conviertePulgadas(entrada, "pies", 0.0833);
                break;
            case "C":
                System.out.println("C - Centímetros");
                conviertePulgadas(entrada, "centímetros", 2.54);
                break;
            case "L":
                System.out.println("L - Leguas");
                conviertePulgadas(entrada, "leguas", 5.260942207392445E-6);
                break;
            case "Y":
                System.out.println("Y - Yarda");
                conviertePulgadas(entrada, "yardas", 0.02777779);
                break;
            default:
                System.out.println("Opción desconocida");
                break;
        }
        
    }
    
    
    
    public static String entradaOpciones(Scanner entrada){
        String tipoMedida;
        
        tipoMedida= entrada.next().toUpperCase();
        // elimina los carácteres en blanco
        tipoMedida = tipoMedida.trim();

        return tipoMedida;
    }
    
    public static void conviertePulgadas(Scanner entrada, String tipoMedida, double razonConversion){
        double conversion, medida;
        System.out.println("Ingresa la medida en "+tipoMedida);
        medida = entrada.nextInt();
        conversion = (medida/razonConversion);
        System.out.println((int)medida+" "+tipoMedida+" equivale a "+conversion+" pulgadas.");
    }
}
