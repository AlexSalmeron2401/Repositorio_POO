/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class Familia extends Contacto {

    private String vivienda;


    public Familia(String nombre, String apellido, int telefono, String vivienda) {
        super(nombre, apellido, telefono);
        this.setVivienda(vivienda);
    }

    public Familia(Persona persona, int telefono, String vivienda) {
        super(persona, telefono);
        this.setVivienda(vivienda);
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }
}

