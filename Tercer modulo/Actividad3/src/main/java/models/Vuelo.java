/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;



/**
 *
 * @author cloud
 */
public class Vuelo {
    private Long id;
    private String numeroDeVuelo;
    private String destino;
    private Boolean escalas;
    private Integer asientosDisponibles;
    private LocalDate fecha;
    
    public Vuelo(Long id,String numeroDeVuelo,String destino, Boolean escalas,Integer asientosDisponibles,
            LocalDate fecha){
    this.id=id;
    this.numeroDeVuelo = numeroDeVuelo;
    this.destino=destino;
    this.escalas = escalas;
    this.asientosDisponibles=asientosDisponibles;
    this.fecha=fecha;
    
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the numeroDeVuelo
     */
    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    /**
     * @param numeroDeVuelo the numeroDeVuelo to set
     */
    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the escalas
     */
    public Boolean getEscalas() {
        return escalas;
    }

    /**
     * @param escalas the escalas to set
     */
    public void setEscalas(Boolean escalas) {
        this.escalas = escalas;
    }

    /**
     * @return the asientosDisponibles
     */
    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    /**
     * @param asientosDisponibles the asientosDisponibles to set
     */
    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
