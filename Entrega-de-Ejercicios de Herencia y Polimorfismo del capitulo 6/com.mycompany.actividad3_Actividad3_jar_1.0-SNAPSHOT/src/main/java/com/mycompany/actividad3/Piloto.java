/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

import models.Persona;

/**
 *
 * @author cloud
 */
public class Piloto extends Persona {

    public Piloto(String rango, String id, String nombre, String apellido, String dni) {
        super(id, nombre, apellido, dni);
        this.rango = rango;
    }
   private String rango;

    /**
     * @return the rango
     */
    public String getRango() {
        return rango;
    }

    /**
     * @param rango the rango to set
     */
    public void setRango(String rango) {
        this.rango = rango;
    }
    public void volar(){
       System.out.println("El "+this.getNombre()+" "+this.getApellido()+
               " está viajando en el vuelo ");
    }
    
}
