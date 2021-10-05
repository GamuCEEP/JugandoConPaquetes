/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.ventas;

import com.ceep.domain.*;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Patata", 3.65d);
        Producto p2 = new Producto("Manzana", 4.50d);
        Producto p3 = new Producto("Pepino", 6d);
        Producto p4 = new Producto("Aguacate", 9.70d);
        
        Orden o1 = new Orden();
        
        o1.agregar_producto(p1);
        o1.agregar_producto(p2);
        o1.agregar_producto(p2);
        o1.agregar_producto(p4);
        o1.agregar_producto(p4);
        o1.agregar_producto(p4);
        
        o1.mostrar_orden();
        /*
        Orden o2 = new Orden();
        
        o2.agregar_producto(p1);
        o2.agregar_producto(p1);
        o2.agregar_producto(p2);
        o2.agregar_producto(p1);
        o2.agregar_producto(p4);
        o2.agregar_producto(p3);
        o2.agregar_producto(p2);
        o2.agregar_producto(p1);
        o2.agregar_producto(p2);
        o2.agregar_producto(p3);
        o2.agregar_producto(p4);
        o2.agregar_producto(p2);
        
        o2.mostrar_orden();
        */
    }
}
