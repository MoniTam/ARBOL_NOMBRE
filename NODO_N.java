/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_n;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class NODO_N {
    
     int dato;
    String nombre;//crea el nodo
    NODO_N hijoizquierdo, hijoderecho;//crea los punteros
    
    public NODO_N(int d, String s){
        this.dato = d;
        this.nombre = s;
        this.hijoizquierdo = null;
        this.hijoderecho = null;//declara los punteros como nulos
    }
    public String toSrting() {
        return nombre + "El dato es : " + dato;
    }
}
