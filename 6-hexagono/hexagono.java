
/**
 * Write a description of class TroncoCono here.
 *
 * @author wolfmaster8
 * @version 1
 */
import java.util.Scanner;
import java.lang.*;

public class hexagono
{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        
        double lado, apotema, area;
        
      System.out.println("\n----Cálculo de Área de un hexágono----");
      
      System.out.println("¿Cuál es la longitud del lado del hexágono?");
      lado=Double.parseDouble(entrada.nextLine());
      while(lado<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuál es la longitud del lado del hexágono?");
          lado=Double.parseDouble(entrada.nextLine());
        }
        
        // hallar el apotema
        apotema = (lado*Math.sqrt(3))/2;
        area = (6*lado*apotema)/2;
        System.out.println("El área del hexágono es: "+area+" unidades cuadradas");
     
    }
}
