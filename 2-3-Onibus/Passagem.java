
/**
 * 
 * @author wolfmaster8
 * @version 1
 */
import java.util.Scanner;
import java.lang.*;

public class Passagem
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double capMaxima, pasajeros, pagoPasajeros, pagoConductor;
        
        System.out.println("-----BHTrans-----");
        System.out.println("¿Cuantas personas caben en el colectivo?");
        capMaxima=entrada.nextInt();
        System.out.println("¿Cuantos pasajeros van?");
        pasajeros=entrada.nextInt();
        
        double totalViajes = numeroViajes(capMaxima, pasajeros);
        
        pagoPasajeros = pasajeros*10000;
        pagoConductor= totalViajes * 2000;
        
        System.out.println("----------\npasajeros: "+(int)pasajeros+"\nCupo máximo: "+(int)capMaxima+"\n-----\nTotal a pagar: "+(int)pagoPasajeros+"\n-----\nEl conductor paga: "+(int)pagoConductor+" por "+(int)totalViajes+" viajes\n----Gracias----\n--BHTrans--");
        
    }
    
    public static double numeroViajes(double capMaxima, double pasajeros){
        double totalViajes;
        int intTotalViajes;
        if(capMaxima >= pasajeros){
          totalViajes = 2;
          return totalViajes;
        }else{
            
            totalViajes = pasajeros/capMaxima;
            
            if(pasajeros % capMaxima == 0){
                intTotalViajes = (int) totalViajes;
            }else{
                intTotalViajes = (int) totalViajes +1;
            }
            totalViajes = (int) Math.round(intTotalViajes)*2;

            return totalViajes;
        }
    }
    
   
}
