/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {

    public static int MAX_PRODUCTOS = 10;

    private static int contador_ordenes;

    private int id_orden;
    private Producto[] productos;
    private int productos_ordenados;
    
    public Orden(){
        
        this.id_orden = contador_ordenes++;
        
        productos = new Producto[MAX_PRODUCTOS];
        productos_ordenados = 0;
    }
    public void agregar_producto(Producto producto){
        if(productos_ordenados >= MAX_PRODUCTOS){
            System.out.println("Se ha alcanzado el limite de productos por orden n."+id_orden+", por favor cree otra orden para continuar");
            return;
        }
        this.productos[productos_ordenados++] = producto;
    }
    public double calcular_total(){
        double total = 0;
        for(Producto producto : productos){
            if(producto == null) 
                continue;
            
            total += producto.getPrecio();
        }
        return total;
    }
    public void mostrar_orden(){
        System.out.println("Orden número:"+id_orden);
        System.out.println("Productos ordenados:");
        for(Producto producto : productos){
            System.out.println("\t"+producto);
        }
        System.out.println("Precio total: "+ calcular_total() + "€");
    }
    
}
