/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class TestBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Integer[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición por búsqueda binaria
        Arrays.sort(datos); // Ordenamiento de datos
        System.out.println("Array ordenado: " + Arrays.toString(datos));
        
        Integer index = Buscar.Binario(datos, 172); 
        System.out.println("Buscando 172 ..."); 
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
        
        index = Buscar.Binario(datos, 255);
        System.out.println("Buscando 255 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
    }
    

