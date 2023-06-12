/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class EventoTrabajo extends Eventos {
    private String departamento;
    private String empresa;

    public EventoTrabajo(String nom_evento, int dia, int mes, int año, String lugar) {
        this(nom_evento, dia, mes, año, lugar, "Bono de ventas");
    }

    public EventoTrabajo(String nom_evento, int dia, int mes, int año, String lugar, String bono_de_ventas) {
        this(nom_evento, lugar, dia, mes, año, "Florencia");
    }

    public EventoTrabajo(String nom_evento, String lugar, int dia, int mes, int año, String florencia) {
        super(nom_evento, dia, mes, año, lugar);
        this.setDepartamento(getDepartamento());
        this.setEmpresa(getEmpresa());
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}