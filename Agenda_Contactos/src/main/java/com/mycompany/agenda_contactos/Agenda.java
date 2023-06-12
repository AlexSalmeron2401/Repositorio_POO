/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contactos;
import java.util.LinkedList;
/**
 *
 * @author Bayron
 */


public class Agenda {
    private LinkedList<Contacto> contactos;
    private LinkedList<Eventos> eventos;

    public Agenda() {
        contactos = new LinkedList<Contacto>();
        eventos = new LinkedList<Eventos>();
    }

    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }
    public void addEvento(Eventos evento) {
        eventos.add(evento);
    }

    public void addEvento(String nom_evento, int dia, int mes, int año, String lugar) {
        eventos.add(new Eventos(nom_evento, dia, mes, año, lugar));
    }

    public void addContacto(String nombre, String apellido, int telefono) {
        contactos.add(new Contacto(nombre, apellido, telefono));
    }

    public void addContacto(Persona persona, int telefono) {
        contactos.add(new Contacto(persona, telefono));
    }

    public void imprimirContactos() {
        for (Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre() + "\n Apellido: " + contacto.getApellido() + "\n Telefono: " + contacto.getTelefono());
                if (contacto instanceof Laboral) {
                    System.out.println("Empresa: " + ((Laboral) contacto).getEmpresa() + "\n Departamento: " + ((Laboral) contacto).getDepartamento() + "\n------------------------");
            } else if (contacto instanceof Servicios) {
                System.out.println("Servicio: " + ((Servicios) contacto).getServicio()+ "\n------------------------");
            } else if (contacto instanceof Familia) {
                System.out.println("Vivienda: " + ((Familia) contacto).getVivienda()+ "\n------------------------");
            }
        }
    }
    public void imprimirEventos(){
        System.out.println("Eventos: ");
        for (Eventos evento : eventos) {
            System.out.println("Nombre del evento: " + evento.getNom_evento() + "\n Dia: " + evento.getDia() + "\n Mes: " + evento.getMes() + "\n Año: " + evento.getAño() + "\n Lugar: " + evento.getLugar());
            if (evento instanceof EventoSocial) {
                System.out.println("------------------------");
            }
  
            if (evento instanceof EventoTrabajo) {
                System.out.println("Celebracion: " + ((EventoTrabajo) evento).getEmpresa() + "\n------------------------");
            }
        }
    }

}