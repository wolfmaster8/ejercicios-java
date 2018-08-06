/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.Scanner;

/**
 *
 * @CAPTAIN328
 */
public class CicloAnidado2 {

   
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
        
        
        int N,D,lim,c;
        float s;
        System.out.println("Ingrese el limite del numerador");
        lim=entrada.nextInt();
        
        N=1;
        
        D=2;
        
        s=0;
        c=0;
        while(c<=lim){
               s=s+N/D;
                       
               N=N+2;
               D=D+2;
               c=c+1;
                        
                        System.out.println(N+"/"+D);
        
        
    }
    
}}
