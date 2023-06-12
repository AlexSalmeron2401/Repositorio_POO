/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class Eventos {
    private String nom_evento;
    private int dia;
    private int mes;
    private int año;
    private String lugar;


public Eventos(String nom_evento, int dia, int mes, int año, String lugar) { //constructor
    this.nom_evento = nom_evento;
    this.dia = dia;
    this.mes = mes;
    this.año = año;
    this.lugar = lugar;
}

    public String getNom_evento() {
        return nom_evento;
    }

    public void setNom_evento(String nom_evento) {
        this.nom_evento = nom_evento;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
