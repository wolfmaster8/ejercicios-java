
/**
 * Programa que calcula la cantidad de dinero recolectado por clases.
 * 
 * @author wolfmaster8
 * @version 1
 */
import java.util.Scanner;
public class sapco
{
    public static void main(String[] args){
      Scanner entrada= new Scanner(System.in);
      
      int clase, vip, platinum, eco;
      int totalclaseVIP = 0;
      int totalclasePla = 0;
      int totalclaseEco = 0;
      
      System.out.println("----Sociedad Aeronáutica de Pilotos Colombianos S.A.---- ");
      do {
      System.out.println("\nIngresa el código de clase \n 1 para clase VIP \n 2 para Platinum \n 3 para ECO \n 4 Ver suma Total \n------- \n 0 para SALIR");
      clase=entrada.nextInt();
      
      switch(clase){
          case 0: 
            System.out.println("Até logo. Muito Obrigado! Hasta luego. ¡Muchas gracias!");
            break;
          case 1: 
            System.out.println("Ingresa el número de pasajeros en clase VIP.");
            vip=entrada.nextInt();
            totalclaseVIP = totalclase(vip, 500000);
            System.out.println("Total clase VIP: $"+totalclaseVIP);
            break;
          case 2: 
            System.out.println("Ingresa el número de pasajeros en clase Platinum.");
            platinum=entrada.nextInt();
            totalclasePla = totalclase(platinum, 200000);
            System.out.println("Total clase Platinum: $"+totalclasePla);
            break;
          case 3:
            System.out.println("Ingresa el número de pasajeros en clase ECO.");
            eco=entrada.nextInt();
            totalclaseEco = totalclase(eco, 1250000);
            System.out.println("Total clase Eco: $"+totalclaseEco);
            break;
          case 4:
            int total = totalclaseEco + totalclasePla + totalclaseVIP;
            System.out.println("Total: $"+total);
            break;
          
          default: System.out.println("No existe esa clase.");
        }
    }while(clase!=0);
    }
    
    
    public static int totalclase(int pasajeros, int valor){
        int totalClase = pasajeros * valor;
        return totalClase;
    }
}
