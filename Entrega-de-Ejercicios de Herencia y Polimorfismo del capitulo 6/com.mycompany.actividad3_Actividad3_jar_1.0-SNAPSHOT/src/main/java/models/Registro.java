/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author cloud
 */
public class Registro {
    private ArrayList<Pasajero> pasajeros = new ArrayList<>();
   
 
    /**
     * @return the pasajeros
     */
    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
    public void agregar(Pasajero pasajero){
        pasajeros.add(pasajero);
    }
    public void buscar(Long id){
    for(Pasajero p:pasajeros){
     if(p.getVuelo().getId()==id){
      System.out.println("Nombre: "+p.getNombre()+" "+p.getApellido());
     }
    }
    }
    
}
