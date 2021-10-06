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
       
        Raton ratonRazer = new Raton("raton", "Razer");
        Raton ratonHP = new Raton("raton", "HP");
        Raton ratonSony = new Raton("raton", "Sony");
        
        Teclado tecladoHP = new Teclado("teclado","HP");
        Teclado tecladoSony = new Teclado("teclado","Sony");
        Teclado tecladoRazer = new Teclado("teclado","Razer");
        
        Monitor monitorSony = new Monitor("Sony",27.5d);
        Monitor monitorLG = new Monitor("LG",27.5d);
        Monitor monitorPhilips = new Monitor("Philips",27.5d);
        
        
        
        
        Computadora c1 = new Computadora("MyPc",monitorLG, tecladoHP, ratonRazer);
        Computadora c2 = new Computadora("pc1",monitorLG, tecladoSony, ratonHP);
        Computadora c3 = new Computadora("pcClase",monitorLG, tecladoRazer, ratonSony);
        Computadora c4 = new Computadora("pc2",monitorPhilips, tecladoHP, ratonRazer);
        Computadora c5 = new Computadora("pc3",monitorPhilips, tecladoSony, ratonHP);
        Computadora c6 = new Computadora("pcTrabajo",monitorPhilips, tecladoRazer, ratonSony);
        Computadora c7 = new Computadora("Portatil",monitorSony, tecladoHP, ratonRazer);
        Computadora c8 = new Computadora("Pc4",monitorSony, tecladoSony, ratonHP);
        Computadora c9 = new Computadora("MyPc",monitorSony, tecladoRazer, ratonSony);
        
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();        
        
        orden1.agregarComputadora(c1);
        orden1.agregarComputadora(c1);
        orden1.agregarComputadora(c3);
        orden1.agregarComputadora(c4);
        orden1.agregarComputadora(c5);
        
        orden1.mostrarOrden();
        
        
        orden2.agregarComputadora(c1);
        orden2.agregarComputadora(c1);
        orden2.agregarComputadora(c4);
        orden2.agregarComputadora(c5);
        orden2.agregarComputadora(c6);
        orden2.agregarComputadora(c7);
        orden2.agregarComputadora(c8);
        orden2.agregarComputadora(c9);
        orden2.agregarComputadora(c3);
        orden2.agregarComputadora(c2);
        orden2.agregarComputadora(c5);
        orden2.agregarComputadora(c7);
        orden2.agregarComputadora(c8);
        orden2.agregarComputadora(c4);
        
        orden2.mostrarOrden();
        
        
        
        
    }
}
