/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class Contacto {
    private Persona persona;
    private int telefono;

    public Contacto(Persona persona, int telefono) { // Constructor 1, en este caso el nombre y apellido se pasan por parametro en un objeto de tipo Persona y luego se asigna a la variable persona
        this.persona = persona;
        this.telefono = telefono;
    }

    public Contacto(String nombre, String apellido, int telefono) { // Constructor 2, en este caso el nombre, apellido y telefono se pasan por parametro.
        this.persona = new Persona(nombre, apellido);
        this.telefono = telefono;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return persona.getNombre();
    }

    public String getApellido() {
        return persona.getApellido();
    }


}
