
/**
 * Programa que hall el área y volumen de un tronco pirámide
 * 
 * @author wolfmaster8
 * @version 0.1
 */
import java.util.Scanner;
import java.lang.*;

public class CalculoAreaVolumen
{
   public static void main(String[] args){
       Scanner entrada= new Scanner(System.in);
       
     ;
       //Valores del área
       double ladoSuperior, ladoInferior, aSuperior,aInferior, areaTronco, apotema, pInferior, pSuperior, altura, volumenTronco;
    
       
       System.out.println("Ingresa el valor del lado superior");
       ladoSuperior=entrada.nextInt();
       
       System.out.println("Ingresa el valor del lado inferior");
       ladoInferior=entrada.nextInt();
       
       System.out.println("Ingresa el valor de la altura");
       altura=entrada.nextInt();
       
       if(ladoSuperior <= 0){
           System.out.println("Ingresa de nuevo el valor del lado superior");
           ladoSuperior=entrada.nextInt();
        }else if(ladoInferior <= 0){
            System.out.println("Ingresa de nuevo el valor del lado inferior");
            ladoInferior=entrada.nextInt();
            
        }else if(altura<=0){
          System.out.println("Ingresa el valor de la altura");
          altura=entrada.nextInt();
        }
        
       // CÁLCULO DEL ÁREA
       // perimetros
        pSuperior = ladoSuperior*4;
        pInferior = ladoInferior*4;
        
       //áreas
       aSuperior = Math.pow(ladoSuperior, 2);
       aInferior = Math.pow(ladoInferior, 2);
       
       //apotema
       apotema = Math.sqrt(Math.pow(altura,2) + Math.pow(ladoInferior/2 ,2));
       
       //Área de la figura
       areaTronco = aSuperior + aInferior + ((pSuperior+pInferior)/2)*apotema;
      
       //Volumen de la figura
       volumenTronco = (altura/3)*(aSuperior+aInferior+Math.sqrt(aSuperior*aInferior));
       
       //Respuestas
       System.out.println("------ \n El área del tronco pirámide es: "+areaTronco);
       System.out.println("------ \n El volumen del tronco pirámide es: "+volumenTronco);
       
        
        
       
       
       
       
       
    }

}
