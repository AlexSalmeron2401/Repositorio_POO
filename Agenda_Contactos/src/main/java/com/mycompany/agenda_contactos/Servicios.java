/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class Servicios extends Contacto {
    private String servicio;

    public Servicios(String nombre, String apellido, int telefono, String servicio) {
        super(nombre, apellido, telefono);
        this.setServicio(servicio);
    }

    public Servicios(Persona persona, int telefono, String servicio) {
        super(persona, telefono);
        this.setServicio(servicio);
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}