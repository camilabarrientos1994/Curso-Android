/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cloud
 */
public class Pasajero extends Persona{
   
    private Boolean hisopado;
    private Vuelo vuelo;

    public Pasajero(Boolean hisopado, Vuelo vuelo, String id, String nombre, String apellido, String dni) {
        super(id, nombre, apellido, dni);
        this.hisopado = hisopado;
        this.vuelo = vuelo;
    }

    /**
     * @return the hisopado
     */
    public Boolean getHisopado() {
        return hisopado;
    }

    /**
     * @param hisopado the hisopado to set
     */
    public void setHisopado(Boolean hisopado) {
        this.hisopado = hisopado;
    }

    /**
     * @return the vuelo
     */
    public Vuelo getVuelo() {
        return vuelo;
    }

    /**
     * @param vuelo the vuelo to set
     */
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

  
    
    
    
}
