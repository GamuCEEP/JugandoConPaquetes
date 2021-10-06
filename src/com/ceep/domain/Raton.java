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
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = contadorRatones++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", idRaton=").append(idRaton);
        return sb.toString();
    }
    
}
