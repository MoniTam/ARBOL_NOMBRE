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
public class ARBOL_NO {
    NODO_N raiz;
    public ARBOL_NO()  {
        raiz = null;
    }
    public void agregarNodo(int d, String nom) {
        NODO_N nuevo = new NODO_N (d, nom);
        if(raiz==null){
            raiz = nuevo;
        } else {
            NODO_N auxiliar = raiz;
            NODO_N padre;
            while(true){
                padre = auxiliar;  //Comparar valor del nodo
                if(d<auxiliar.dato){
                    auxiliar = auxiliar.hijoizquierdo;
                    if(auxiliar==null) {
                        padre.hijoizquierdo = nuevo;
                        return;
                    }
                }else {
                    auxiliar = auxiliar.hijoderecho;
                    if(auxiliar==null){
                        padre.hijoderecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean estaVacio() {
        return raiz == null;
    }

    public void preOrden(NODO_N r){
        if(r != null){
            System.out.println(r.dato);
            preOrden(r.hijoizquierdo);
            preOrden(r.hijoderecho);
        }
    }
}
