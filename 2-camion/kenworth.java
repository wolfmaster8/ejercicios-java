
/**
 * Write a description of class kenworth here.
 * 
 * @author wolfmaster8
 * @version 0.1
 */
import java.util.Scanner;
public class kenworth
{
  public static void main(String[] args){
      Scanner entrada= new Scanner(System.in);

      double kg, kgMax, consumo, totalViajes, totalGalones;
      double distancia = 81.7;
      
      System.out.println("¿Cual es el peso (kg) de la carga?");
      kg=entrada.nextInt();
       
      System.out.println("¿Cual es el peso (kg) máximo que puede llevar el camión?");
      kgMax=entrada.nextInt();
      
      System.out.println("¿Cuantos galones por kilómetro consume el camión?");
      consumo=entrada.nextInt();
    }
}
