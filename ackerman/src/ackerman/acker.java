/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ackerman;

import java.util.Scanner;

/**
 *
 * @author eq28
 */
public class acker {
  static  Scanner leer= new Scanner(System.in);
    static int Ackerman(int m, int n){
        if(m==0)
            return n+1;
        else if(n==0)
            return Ackerman(m-1,1);
        else
            return Ackerman(m-1,Ackerman(m,n-1));
}
}
