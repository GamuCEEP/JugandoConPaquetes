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
public class Vehiculo {

    private String matricula, marca, modelo, color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getAtributos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{matricula=").append(matricula);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", tarifa=").append(tarifa);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
    }

}
