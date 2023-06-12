/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenda_contactos;

/**
 *
 * @author Bayron
 */
import java.util.LinkedList;

public class Agenda_Contactos {
    public static void main(String[] args) {
        //LinkedList<Contacto> contactos = new LinkedList<Contacto>();
        //contactos.add(new Contacto("Juan", "Perez", 123456)); // Construtor de contacto 2
        //contactos.add(new Contacto(new Persona("Maria", "Gomez"), 654321)); // Constructor de contacto 1





    Agenda agenda = new Agenda();
    agenda.addContacto(new Servicios("Marco", "Salas", 8768678, "Fontanero"));
    agenda.addContacto(new Familia("Juan", "Contreras", 40793402, "Casa"));
    agenda.addContacto(new Laboral("Brayan", "Acuña", 23132121, "Accenture", "desarollo de software"));
    agenda.addEvento(new EventoSocial("Cena de amigos", "Coco lodge", 10, 12, 2023, "Florencia"));
    agenda.addEvento(new EventoTrabajo("Fiesta", 23, 04, 2012, "San Pedro", "Bono de ventas"));


    agenda.imprimirContactos();
    agenda.imprimirEventos();

    }
}
