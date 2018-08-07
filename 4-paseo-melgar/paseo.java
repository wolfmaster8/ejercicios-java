
/**
 * Write a description of class paseo here.
 * 
 * @author wolfmaster8
 * @version 1
 */
import java.util.Scanner;
public class paseo
{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

      int gordinhos, fracos, sillas, precioComida, precioHabit, personasHabit, precioBuses, numDias ;
      
      
      System.out.println("\n------Nos vamos para Melgar------");
      
      System.out.println("¿Cuántos estudiantes gorditos van?");
      gordinhos=entrada.nextInt();
      while(gordinhos<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuántos estudiantes gorditos van?");
          gordinhos=entrada.nextInt();
        }
        
      System.out.println("¿Cuántos estudiantes flaquitos van?");
      fracos=entrada.nextInt();
      while(gordinhos<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuántos estudiantes flaquitos van?");
          fracos=entrada.nextInt();
        }
        
      System.out.println("¿Cuántas sillas tiene cada bus?");
      sillas=entrada.nextInt();
      while(sillas<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuántas sillas tiene cada bus?");
          sillas=entrada.nextInt();
        }
        
      System.out.println("¿Cuánto cuesta el alquiler de cada bus?");
      precioBuses=entrada.nextInt();
      while(precioBuses<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuánto cuesta el alquiler de cada bus?");
          precioBuses=entrada.nextInt();
        }
        //ida y vuelta
          precioBuses = precioBuses *2;
        
      System.out.println("¿Cuánto cuesta cada plato de comida?");
      precioComida=entrada.nextInt();
      while(precioComida<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuánto cuesta cada plato de comida?");
          precioComida=entrada.nextInt();
        }
        
      System.out.println("¿Cuánto cuesta cada habitación?");
      precioHabit=entrada.nextInt();
      while(precioHabit<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuánto cuesta cada habitación?");
          precioHabit=entrada.nextInt();
        }
        
      System.out.println("¿Cuántas personas caben por habitación?");
      personasHabit=entrada.nextInt();
      while(personasHabit<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuántas personas caben por habitación?");
          personasHabit=entrada.nextInt();
        }
        
      System.out.println("¿Cuántos días dura el paseo?");
      numDias=entrada.nextInt();
      while(numDias<=0){
          System.out.println("\n Ingresa un número mayor a 0. ¿Cuántos días dura el paseo?");
          numDias=entrada.nextInt();
        }
       System.out.println("-----RESUMEN-----");
       int totalBuses= numerobuses(gordinhos,fracos,sillas);
       System.out.println("Se necesitan: "+ totalBuses + " buses.");
       
       int totalAlquilerBuses = totalBuses * precioBuses;
       System.out.println("Alquiler total de buses: $"+totalAlquilerBuses);
       
       int precioTotalComida = preciocomida(gordinhos, fracos, precioComida, numDias);
       System.out.println("Costo total de la comida por los "+numDias+" días: $"+precioTotalComida);
       
       int numeroHabitaciones = numerohabitaciones(gordinhos, fracos, personasHabit);
       System.out.println("Se necesitan "+numeroHabitaciones+ " habitaciones.");
       
       int totalPagoHabitaciones = numeroHabitaciones*precioHabit;
       System.out.println("Costo total de las habitaciones por "+numDias+" días: $"+totalPagoHabitaciones);
       
       float diaCostoHabitacion =(float) totalPagoHabitaciones/numDias;
       System.out.println("Costo diario por habitación: $"+diaCostoHabitacion);
       System.out.println("-----FELIZ VIAJE-----");
    }
    
    public static int numerobuses(int gordinhos, int fracos, int sillas){
        int totalBuses;
        gordinhos = gordinhos *2;
        int totalEstudiantes = gordinhos + fracos;
        float buses =(float) totalEstudiantes/sillas;
        float moduloBuses = totalEstudiantes%sillas;
        if(moduloBuses != 0){
            buses = (int) buses + 1;
            totalBuses = (int) buses;
        }else{
            totalBuses = (int) buses;
        }
        return totalBuses;
        }
        
    public static int preciocomida(int gordinhos, int fracos, int precioComida, int numDias){
        int precioTotalComida, precioGordinhos, precioFracos;
        precioGordinhos = precioComida * 5 * gordinhos * numDias;
        precioFracos = precioComida * 3 * fracos * numDias;
        precioTotalComida = precioFracos + precioGordinhos;
        return precioTotalComida;
    }
    
    public static int numerohabitaciones(int gordinhos, int fracos, int personasHabit){
        int numeroHabitaciones, totalEstudiantes;
        totalEstudiantes = gordinhos + fracos;
        
        float habitaciones =(float) totalEstudiantes/personasHabit;
        float moduloHabitaciones = totalEstudiantes%personasHabit;
        if(moduloHabitaciones != 0){
            habitaciones = (int) habitaciones + 1;
            numeroHabitaciones = (int) habitaciones;
        }else{
            numeroHabitaciones = (int) habitaciones;
        }
        return numeroHabitaciones;
    }
        
}

