/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treelink;

import Actividades.ItemDuplicated;
import Actividades.ItemNoFound;

/**
 *
 * @author Miguel
 */
public class Test<E>{
    public static void main(String[] args) {
        //ACTIVIDADES
        BSTree<Integer> nodos1 = new BSTree<>();
        try {
            nodos1.insert(8);
            nodos1.insert(3);
            nodos1.insert(10);
            nodos1.insert(1);
            nodos1.insert(6);
            nodos1.insert(4);
            nodos1.insert(7);
            nodos1.insert(14);
            nodos1.insert(13);
        } catch (ItemDuplicated e) {
            System.out.println("Elemento duplicado");
        }
        
//        try {
//            int buscar = nodos1.search(13);
//            System.out.println("Elemento " + buscar + " encontrado");
//        } catch (ItemNoFound e) {
//            System.out.println("Elemento no encontrado");
//        }
//        
//        int eliminar = 13;
//        System.out.println("Eliminar nodo " + 13);
//        nodos1.remove(eliminar);
//        
//        try {
//            int buscar = nodos1.search(13);
//            System.out.println("Elemento " + buscar + " encontrado");
//        } catch (ItemNoFound e) {
//            System.out.println("Elemento no encontrado");
//        }
        //Ejercicio 1 A
//        int noHijos = nodos1.countNodes();
//        System.out.println("Cantidad de nodos no-hijos: " + noHijos);
        //Ejercicio 1 B
        try {
            int altura = nodos1.height(3);
            System.out.println("Altura del nodo 3: " + altura);
        }catch (ItemNoFound e){
            System.out.println("No se encontro el nodo");
        }
        //Ejercicio 2 A
        int area1 = nodos1.areaBST();
        System.out.println("Area: " + area1);
        
        //Ejercicio 3
        System.out.println("Itertivo");
        nodos1.iterativePreOrder();
        System.out.println("");
        //Ejercicio 4
        int total = nodos1.totalNodos();
        System.out.println("Cantidad de nodos totales: " + total);
        
    }
    
    //EJERCICIO 2 B
    public static <E extends Comparable<E>> boolean sameArea(BSTree<E> arbol1, BSTree<E> arbol2) {
        return arbol1.areaBST() == arbol2.areaBST();
    }   
}
