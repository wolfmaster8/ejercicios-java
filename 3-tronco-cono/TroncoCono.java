
/**
 * Write a description of class TroncoCono here.
 *
 * @author wolfmaster8
 * @version 1
 */
import java.util.Scanner;
import java.lang.*;

public class TroncoCono
{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        
        double radioSup, radioInf, altura, volumen;
        
      System.out.println("\n----Cálculo de Volumen de un Tronco de Cono----");
      
      System.out.println("¿Cuál es el radio del cono inferior?");
      radioInf=Double.parseDouble(entrada.nextLine());
      while(radioInf<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuál es el radio del cono inferior?");
          radioInf=Double.parseDouble(entrada.nextLine());
        }
        
      System.out.println("¿Cuál es el radio del cono superior?");
      radioSup=Double.parseDouble(entrada.nextLine());
      while(radioSup<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuál es el radio del cono superior?");
          radioSup=Double.parseDouble(entrada.nextLine());
        }
        
      System.out.println("¿Cuál es la altura del tronco de cono?");
      altura=Double.parseDouble(entrada.nextLine());
      while(altura<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuál es la altura del tronco de cono?");
          altura=Double.parseDouble(entrada.nextLine());
        }
        
        volumen = ((altura*Math.PI)/3)*(Math.pow(radioSup, 2) + Math.pow(radioInf, 2) + radioInf*radioSup);
        
        System.out.println("El volumen del tronco cono es: "+volumen+" unidades cúbicas");
     
    }
}
