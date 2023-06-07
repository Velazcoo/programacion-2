/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejarbol;

/**
 *
 * @author eq27
 */
public class ArbolB {
    Nodo padre;
Nodo raiz;
public ArbolB(){ //Constructor
raiz = null; }
public void InsertaNodo (int elem){ //Inserción de un elemento en el árbol
if(raiz == null)
raiz = new Nodo (elem);
else
raiz.InsertaBinario (elem);
}
//recorrido preorden Recursivo del árbol
public void Preorden (Nodo Nodo){
if(Nodo == null) return;
else{
System.out.print (Nodo.getElemento() + " ");
Preorden (Nodo.getRamaIz());
Preorden (Nodo.getRamaDer());
}
}
//PostOrden recursivo del árbol
public void PostOrden (Nodo Nodo){
if(Nodo == null) return;
else{
PostOrden (Nodo.getRamaIz());
PostOrden (Nodo.getRamaDer());
System.out.print (Nodo.getElemento() + " ");
}
}
//Inorden Recursivo del árbol
public void Inorden (Nodo Nodo){
if(Nodo == null) return;
else{
Inorden (Nodo.getRamaIz());
System.out.print(Nodo.getElemento() + " ");
Inorden (Nodo.getRamaDer());
}
}
//Busca un elemento en el árbol
void Busqueda (int Elem, Nodo A){
if((A == null) | (A.getElemento() == Elem)){
System.out.print(A.getElemento() + " ");
return;
}
else{
if(Elem>A.getElemento()) Busqueda (Elem, A.getRamaDer());
else Busqueda ( Elem, A.getRamaIz());
}
}
//Altura del árbol
public int Altura (Nodo Nodo){ // cuenta el número de niveles del árbol
int Altder = (Nodo.getRamaDer() == null? 0:1 + Altura (Nodo.getRamaDer()));
int Altizq = (Nodo.getRamaIz()== null? 0:1 + Altura (Nodo.getRamaDer()));
return Math.max(Altder,Altizq);
}
}
