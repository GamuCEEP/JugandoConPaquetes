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
    private final int idOrden;
    private static int contadorOrdenes;
    private final Computadora[] computadoras;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = contadorOrdenes++;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras >= MAX_COMPUTADORAS){
            System.out.println("Maximo de computadoras por orden alcanzado, por favor cree una nueva orden");
            return;
        }
        computadoras[contadorComputadoras++] = computadora;
    }
    public void mostrarOrden(){
        System.out.println("Orden n."+idOrden);
        for(Computadora comp : computadoras){
            if(comp == null) continue;
            
            System.out.println(comp);
        }
        System.out.println("");    }
    
}
