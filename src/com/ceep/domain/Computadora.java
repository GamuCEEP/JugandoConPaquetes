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
public class Computadora {

    private final int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private Monitor[] monitores;
    private final static int MAX_MONITORES = 4;
    private int contadorMonitores;
    private Teclado teclado;
    private Raton raton;

    public Computadora() {
        this.idComputadora = contadorComputadoras++;
        this.monitores = new Monitor[MAX_MONITORES];
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        agregarMonitor(monitor);
        this.teclado = teclado;
        this.raton = raton;
    }

    public void agregarMonitor(Monitor monitor) {
        if (contadorMonitores >= MAX_MONITORES) {
            System.out.println("Demasiados monitores");
            return;
        }
        this.monitores[contadorMonitores++] = monitor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor[] getMonitor() {
        return monitores;
    }

    public void setMonitor(Monitor... monitores) {
        for (Monitor monitor : monitores) {
            agregarMonitor(monitor);
        }
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora:idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", monitores=");
        for (Monitor monitor : monitores) {
            if (monitor != null) {
                sb.append(monitor);
            }
        }
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        return sb.toString();
    }

}
