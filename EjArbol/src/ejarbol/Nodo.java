/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejarbol;

/**
 *
 * @author eq27
 */
public class Nodo {
    //Atributos
private int elemento;
private Nodo ramaIz; //Apunta a la rama izquierda
private Nodo ramaDer; //Apunta a la rama derecha
public Nodo(int elemento ) {//Constructor
this.elemento = elemento;
ramaIz=null;
ramaDer=null; }
public void InsertaBinario (int elem){//define las acciones a verificar al momento de insertar nodo
if(elem < this.elemento){
if (ramaIz == null)
ramaIz = new Nodo(elem);
else
    ramaIz.InsertaBinario(elem);
}
else{
if (elem > this.elemento){
if (ramaDer == null)
ramaDer = new Nodo(elem);
else
ramaDer.InsertaBinario(elem);
}
} }
//Setters y Getters
public int getElemento() { return elemento; }
public void setElemento(int elemento) { this.elemento = elemento; }
public Nodo getRamaIz() { return ramaIz; }
public void setRamaIz(Nodo ramaIz) { this.ramaIz = ramaIz; }
public Nodo getRamaDer() { return ramaDer; }
public void setRamaDer(Nodo ramaDer) { this.ramaDer = ramaDer; }
@Override
public String toString() {
return "Nodo{" + "elemento=" + elemento + ", ramaIz=" + ramaIz + ", ramaDer=" + ramaDer + '}';
}
}

