/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int monedas[]={50,20,10,5,1};
        int cantidad[]={0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un Numero:");
        int num=sc.nextInt();
        cantidad[0]=num;
        for(int i=0;i<5;i++){
            cantidad[i]=num/monedas[i];
            while(cantidad[i]>0 && cantidad[i]!=num-1){
                int res=num-(monedas[i]*cantidad[i]);
                for(int j=0;j<5;j++){
                    if(j>i){
                        cantidad[j]=res/monedas[j];
                        res-=monedas[j]*cantidad[j];
                    }
                    System.out.println(cantidad[j]+" monedas de "+monedas[j]);
                }
                System.out.println("----------------------");
                cantidad[i]--;
            }
 
        }
    }
    }
    
