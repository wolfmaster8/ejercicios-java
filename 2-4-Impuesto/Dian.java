
/**
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Dian
{
    public static void main(String[] args){
      Scanner entrada= new Scanner(System.in);

      int precioBruto, tipo, impuesto, precioNeto;
      
      
      System.out.println("\n------DIAN | Impuestos Automotrices------");
      
      System.out.println("Ingrese: \n1 Para Camioneta\n2 Para automóvil");
      tipo=entrada.nextInt();
      System.out.println("Ingrese el valor del vehículo");
      precioBruto=entrada.nextInt();
      
      
      switch(tipo){
        case 1:
            System.out.println("Impuesto para CAMIONETA");
            if(precioBruto < 80){
                impuesto = 0;
                precioNeto = precios(precioBruto, impuesto);
                fala(precioNeto, impuesto);
            }else{
                impuesto = precioBruto/2;
                precioNeto = precios(precioBruto, impuesto);
                fala(precioNeto, impuesto);
            }
            break;
        case 2:
            System.out.println("Impuesto para AUTOMÓVIL");
            if(precioBruto <20){
                impuesto = 5;
                precioNeto = precios(precioBruto, impuesto);
                fala(precioNeto, impuesto);
            }else if(precioBruto >= 20 && precioBruto <= 40){
                impuesto = precioBruto/5;
                precioNeto = precios(precioBruto, impuesto);
                fala(precioNeto, impuesto);
            }else{
             impuesto = 9;   
             precioNeto = precios(precioBruto, impuesto);
                fala(precioNeto, impuesto);
            }
            break;
        default:
            System.out.println("Opción Desconocida");
            break;
    }
     
 
    }
    
    public static int precios(int precioBruto, int impuesto){
        
        int precioNeto = precioBruto + impuesto;
        
        return precioNeto;
    }
    
    public static void fala(int precioNeto, int impuesto){
        
        System.out.println("Impuesto: $"+impuesto+"\nPrecio Neto: $"+precioNeto);
    }
}
