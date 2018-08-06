
 

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @CAPTAIN328
 */
public class Cajeroatm {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int e,eh,epag,eotr,saldo,dep,numdep,c,desc,imp,servc;
        saldo=300000;
        String entr,eah,val,dat,serv;
        imp=2500;/*IMPUESTO BANCO POR OPERACIONES BANCARIAS*/
        do{
   /*MENU PRINCIPAL*/
            
    
        entr=JOptionPane.showInputDialog("Bienvenido a su ATM \n Elija La Operacion que desea realizar \n 1. Cuenta de Ahorros\n 2. Cuenta Corriente\n 3. ◘Salir");  
        e=Integer.parseInt(entr);
        
        switch(e){
            
            case 1:
                do{/*MENU CTA AHORROS*/
                    eah=JOptionPane.showInputDialog("Elija La Operacion que desea realizar \n 1. Depósitos\n 2. Consultas \n 3. Pago de Servicios \n 4. Transferir Fondos \n 5. Cambio de Clave \n 6. ◄Volver");  
        eh=Integer.parseInt(eah);
                switch(eh){
                    case 1:
                       
                        val=JOptionPane.showInputDialog(null,"1-DEPÓSITOS \n Ingrese el número de depósitos");  
                        numdep=Integer.parseInt(val);
                       
                       if(numdep>0){   /*CICLO PARA PEDIR VARIOS DEPOSITOS*/
                      desc=0;
                           for(c=1;c<=numdep;c++){
                            dat=JOptionPane.showInputDialog(null,"Ingrese el Depósito #"+c); 
                            dep=Integer.parseInt(dat);         
                            desc=desc+dep-imp;/*TOTAL DEPOSITOS*/
                        }saldo=saldo+desc;/*SALDO FINAL*/
                        JOptionPane.showMessageDialog(null, "El saldo depositado es: $"+desc+" COP \n SU SALDO ES: $"+saldo+" COP");
                       
                       
                        /*DEPOSITOS FINISHED*/
                       }else JOptionPane.showMessageDialog(null,"Valor no valido","Error",JOptionPane.ERROR_MESSAGE); 
                            
                        break;
                    case 2:
                        
                        break;
                        
                        case 3:/*SERVICIOS*/
                            do{
                                val=JOptionPane.showInputDialog(null,"3-Pago de Servicios \n Elija el servicio a pagar \n 1. Teléfono \n 2. Luz \n 3. Agua \n 4. Gas \n 5. Otros \n 6. ◄Volver");  
                        /*5. TERCER MENU - OTROS*/
                                epag=Integer.parseInt(val);
                        
                        
                        switch(epag){
                             case 1: /*telefono*/
                        serv=JOptionPane.showInputDialog(null,"Ingrese el valor a pagar en Codensa"); 
                            servc=Integer.parseInt(serv);
                            saldo=saldo-servc;
                            JOptionPane.showMessageDialog(null, "Ha sido debitado: $"+servc+"Su saldo es: $"+saldo);
                        break;
                            case 2: /*luz*/
                        
                        break;
                            case 3:
                        
                        break;
                            case 4:
                        
                        break;
                            case 5:/*OTROS SERVICIOS*/
                                do{
                                System.out.println("5-OTROS SERVICIOS");
                                System.out.println("Elija el servicio a pagar");
                                System.out.println("1. USB Matrícula");
                                System.out.println("2. AIAA Suscripción");
                                System.out.println("3. Migue y La Mona-Deudas");
                                System.out.println("4. ◄Volver");
                                eotr=entrada.nextInt();
                                switch(eotr){
                                    case 1:
                                
                                break;
                                    case 2:
                                
                                break;
                                    case 3:
                                    
                                break;
                                    
                                }
                                }while(eotr!=4);
                        
                        break;
                        
                            }}while(epag!=6);/*PAGO DE SERVICIOS -FIN*/
                        break;
                    case 4:/*TRANSFERIR FONDOS*/
                        
                        break;
                        case 5:
                        
                        break;
                    
                }
                
        }while(eh!=6);/*MENU CTA AHORROS - FIN*/
        
                break;
            case 2:
                /*CTA CORRIENTE*/
                /*PEGAR MISMO CUENTA AHORROS*/
                
              
    }
    
    }while(e!=3);
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
        
    if (resp == JOptionPane.NO_OPTION) {
      System.out.println("No button clicked");
    } else if (resp == JOptionPane.YES_OPTION) {
      System.exit(0);
    } else if (resp == JOptionPane.CLOSED_OPTION) {
      System.out.println("JOptionPane closed");
    }/*FIN DEL PROGRAMA - NO TOCAR*/
    }}