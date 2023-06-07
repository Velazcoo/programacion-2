/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopila;

/**
 *
 * @author Diego
 */
public class Nodo {
    private int elemento;
private Nodo siguiente; //Apunta al siguiente nodo
//Constructor
public Nodo(int elemento, Nodo siguiente) {
this.elemento = elemento;
this.siguiente = siguiente;
}
//Métodos
public int getElemento() { return elemento; }
public void setElemento(int elemento) { this.elemento = elemento; }
public Nodo getSiguiente() { return siguiente; }
public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
@Override
public String toString() { return elemento + "\n"; }
}

