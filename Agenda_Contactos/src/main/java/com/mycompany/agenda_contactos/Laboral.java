/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
public class Laboral extends Contacto{
    private String empresa;
    private String departamento;

    public Laboral(String nombre, String apellido, int telefono, String empresa, String departamento) {
        super(nombre, apellido, telefono);
        this.setEmpresa(empresa);
        this.setDepartamento(departamento);
    }

    public Laboral(Persona persona, int telefono, String empresa, String departamento) {
        super(persona, telefono);
        this.setEmpresa(empresa);
        this.setDepartamento(departamento);
    }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }
}