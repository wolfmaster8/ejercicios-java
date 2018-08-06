
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

      double kg, kgMax, consumo, totalViajes, totalGalones, distanciaTotal;
      double distancia = 81.7;
      
      System.out.println("\n------Cálculo de Combustible, Viajes y Distancia------");
      
      System.out.println("¿Cual es el peso (kg) total de todo el cargamento a llevar?");
      kg=Double.parseDouble(entrada.nextLine());
      while(kg<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cual es el peso (kg) total de todo el cargamento a llevar?");
          kg=Double.parseDouble(entrada.nextLine());
        }
       
      System.out.println("¿Cual es el peso (kg) máximo que puede llevar el camión?");
      kgMax=Double.parseDouble(entrada.nextLine());
      while(kgMax<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cual es el peso (kg) máximo que puede llevar el camión?");
          kgMax=Double.parseDouble(entrada.nextLine());
        }
      
      System.out.println("¿Cuantos galones por kilómetro consume el camión? (gal/km)");
      consumo=Double.parseDouble(entrada.nextLine());
      while(consumo<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuantos galones por kilómetro consume el camión? (gal/km) Ejemplo: 1.2");
          consumo=Double.parseDouble(entrada.nextLine());
        }
      
      // total gasolina camion
      totalGalones = consumo*distancia;
      
      // número total de viajes si la carga está dentro del límite
      if(kgMax >= kg){
          totalViajes = 2;
          distancia = distancia*totalViajes;
           // total gasolina camion
           totalGalones = consumo*distancia;
           System.out.println("-------\n En total el camión debe hacer 1 viaje ida y vuelta. \n-------\n Deberá cargar "+totalGalones+" galones de Diesel.  \n------- \n Distancia Total: "+distancia+" km");
        }else{
            
            totalViajes = kg/kgMax;
            int intTotalViajes = (int) totalViajes;
            System.out.println(intTotalViajes);
            
            //Convierte a 
            totalViajes = (int) Math.round(intTotalViajes) + 1;
            distancia = distancia*(totalViajes*2);
            totalGalones = consumo*distancia;
            System.out.println("-------\nEn total el camión debe hacer "+totalViajes+" viajes ida y vuelta. \n-------\n Deberá cargar "+totalGalones+" galones de Diesel.  \n------- \n Distancia Total: "+distancia+" km");
        }
      System.out.println("------- \n Recuerda revisar el aire de las llantas y tus frenos. Feliz viaje :)");
    }
}
