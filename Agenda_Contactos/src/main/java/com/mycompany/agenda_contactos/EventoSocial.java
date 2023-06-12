/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class EventoSocial extends Eventos{
    private String celebracion;

    public EventoSocial(String nom_evento, int dia, int mes, int año, String lugar, String celebracion) {
        this(nom_evento, lugar, dia, mes, año, celebracion);
    }

    public EventoSocial(String nom_evento, String lugar, int dia, int mes, int año, String celebracion) {
        super(nom_evento, dia, mes, año, lugar);
        this.celebracion = celebracion;
    }


        public String getCelebracion() {
            return celebracion;
        }

        public void setCelebracion(String celebracion) {
            this.celebracion = celebracion;
        }
}