
/**
 * Write a description of class paseo here.
 * 
 * @author wolfmaster8
 * @version 1
 */
import java.util.Scanner;
import java.lang.*;
public class triangulo
{
   public static void main(String[] args){
       Scanner entrada= new Scanner(System.in);
       double a, b, c;
       
      System.out.println("-----Cálculo de medidas Triángulo------");
      
      System.out.println("Medida del lado 1:");
      a=Double.parseDouble(entrada.nextLine());
      while(a<=0){
          System.out.println("\n Ingresa un número mayor a 0. Medida del lado 1:");
          a=Double.parseDouble(entrada.nextLine());
        }
        
        System.out.println("Medida del lado 2:");
      b=Double.parseDouble(entrada.nextLine());
      while(b<=0){
          System.out.println("\n Ingresa un número mayor a 0. Medida del lado 2:");
          b=Double.parseDouble(entrada.nextLine());
        }
        
        System.out.println("Medida del lado 3:");
      c=Double.parseDouble(entrada.nextLine());
      while(c<=0){
          System.out.println("\n Ingresa un número mayor a 0. Medida del lado 3:");
          c=Double.parseDouble(entrada.nextLine());
        }
        
        double semiPerimetro = semiperimetro(a,b,c);
        System.out.println("El Semiperímetro es: "+semiPerimetro);
        
        double areaT = area(semiPerimetro,a,b,c);
        System.out.println("El área es: "+areaT);
        
        double circum = circumradio(a,b,c, areaT);
        System.out.println("El Circumradio es: "+circum);
    }
    
    public static double semiperimetro(double a, double b, double c){
        double semiPerimetro;
        
        semiPerimetro = (a+b+c)/2;
        
        return semiPerimetro;
    }
    
    public static double area(double s, double a, double b, double c){
        double areaT;
        areaT = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return areaT;
    }
    
    public static double circumradio(double a, double b, double c, double area){
        double circum;
        circum =(a*b*c)/((4*Math.PI)*area);
        return circum;
    }
}
