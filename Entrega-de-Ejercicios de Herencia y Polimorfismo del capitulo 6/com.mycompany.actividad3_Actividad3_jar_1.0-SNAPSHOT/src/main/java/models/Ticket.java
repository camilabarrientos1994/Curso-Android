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
public class Ticket {
    private Long id;
    private int num_ticket;
    private int embarque;
    private LocalDate emision;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private float valor;

    public Ticket(Long id,int num_ticket,int embarque,LocalDate emision,
            Pasajero pasajero,Vuelo vuelo,float valor){
    this.id=id;
    this.num_ticket=num_ticket;
    this.embarque=embarque;
    this.emision=emision;
    this.pasajero=pasajero;
    this.vuelo=vuelo;
    this.valor=valor;
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
     * @return the num_ticket
     */
    public int getNum_ticket() {
        return num_ticket;
    }

    /**
     * @param num_ticket the num_ticket to set
     */
    public void setNum_ticket(int num_ticket) {
        this.num_ticket = num_ticket;
    }

    /**
     * @return the embarque
     */
    public int getEmbarque() {
        return embarque;
    }

    /**
     * @param embarque the embarque to set
     */
    public void setEmbarque(int embarque) {
        this.embarque = embarque;
    }

    /**
     * @return the emision
     */
    public LocalDate getEmision() {
        return emision;
    }

    /**
     * @param emision the emision to set
     */
    public void setEmision(LocalDate emision) {
        this.emision = emision;
    }

    /**
     * @return the pasajero
     */
    public Pasajero getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
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

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
}
