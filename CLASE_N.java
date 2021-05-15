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
public class CLASE_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dato;
        String nombre;
        ARBOL_NO miArbol = new ARBOL_NO();
        miArbol.agregarNodo(77, "M");
        miArbol.agregarNodo(73, "I");
        miArbol.agregarNodo(79, "O");
        miArbol.agregarNodo(67, "C");
        miArbol.agregarNodo(76, "L");
        miArbol.agregarNodo(78, "N");
        miArbol.agregarNodo(83, "S");
        miArbol.agregarNodo(65, "A");
        miArbol.agregarNodo(69, "E");
        miArbol.agregarNodo(84, "T");
        miArbol.agregarNodo(68, "D");
        miArbol.agregarNodo(70, "F");
        miArbol.agregarNodo(89, "Y");
        
        System.out.println("========Preorden========");
            if(!miArbol.estaVacio()){
            miArbol.preOrden(miArbol.raiz);
        }
    }  
    
}
