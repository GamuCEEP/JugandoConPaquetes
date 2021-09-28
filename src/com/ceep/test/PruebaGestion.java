/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;

//Importamos la clase que hemos creado en otro paquete
import com.ceep.domain.Vehiculo;

/**
 *
 * @author Alumno Mañana
 */
public class PruebaGestion {
    public static void main(String[] args) {
        Vehiculo C1 = new Vehiculo("8349PWE","Audi","A3","verde",15_000d,true);
        System.out.println(C1.getAtributos());
    }
}
