
/**
 * Write a description of class Conversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.*;
public class AreaSombreada
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double radio, areaSombreada;
        
        System.out.println("-----Hallar el área sombreada-----");
        System.out.println("Ingresa el valor del radio del círculo");
        radio=entrada.nextInt();
        double areaCirculo = circulo(radio);
        double areaCuadrado = cuadrado(radio);
        areaSombreada = areaCirculo - areaCuadrado;
        System.out.println("El área sombreada es de: "+areaSombreada+" unidades cuadradas");
        
    }
    
    public static double circulo(double radio){
        double areaCirculo;
        areaCirculo = (Math.PI)*Math.pow(radio, 2);
        
        return areaCirculo;
    }
    
    public static double cuadrado(double radio){
        double areaCuadrado;
        areaCuadrado = (Math.pow(radio, 2))/2;
        
        return areaCuadrado;
    }
}
