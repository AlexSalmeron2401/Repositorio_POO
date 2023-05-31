/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
public class Operator extends Element{
    private char operador;

    public Operator(char operador) {
        this.operador = operador;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Operator{" + "operador=" + operador + '}';
    }
    
}
