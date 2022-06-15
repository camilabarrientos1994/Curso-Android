/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cloud
 */
public class Pasajero {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer dni;
    private Boolean hisopado;
    private Vuelo vuelo;

    public  Pasajero(Long id,String nombre,String apellido, Integer dni,Boolean hisopado,Vuelo vuelo){
         
        this.id= id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.hisopado=hisopado;
        
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public Integer getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(Integer dni) {
        this.dni = dni;
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
