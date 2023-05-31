/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Expresion {
    private ArrayList<String> elements;
    
    public Expresion() {
        elements = new ArrayList<>();
    }
    
    public void reconocer(String expresion){
        String numeroActual = "";
        for (int i = 0; i < expresion.length(); i++) {
            char caracterActual = expresion.charAt(i);
            if (Character.isDigit(caracterActual)) {
                numeroActual += caracterActual;
            } else {
                if (!numeroActual.equals("")) {
                    elements.add(numeroActual);
                    numeroActual = "";
                }
                if (caracterActual != '*' && caracterActual != '-' && caracterActual != '+' && caracterActual != '/') {
                    throw new IllegalArgumentException("Carácter inválido en la expresión: " + caracterActual);
                }
                elements.add(Character.toString(caracterActual));
                
            }
        }
        if (!numeroActual.equals("")) {
            elements.add(numeroActual);
        }
    }

    public int resolver() {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Character> operadores = new ArrayList<>();
        // Iterar sobre los elementos de la expresión
        for (String elemento : elements) {
            // Si el elemento es un número, agregarlo al ArrayList de números
            if (Character.isDigit(elemento.charAt(0))) {
                numeros.add(Integer.parseInt(elemento));
            }
            // Si el elemento es un operador, agregarlo al ArrayList de operadores
            else {
                operadores.add(elemento.charAt(0));
            }
        }

        // Verificar si la lista de números está vacía
        if (numeros.size() == 0) {
            System.out.println("No se encontraron números en la expresión");
            return 0;
        }

        // Inicializar el resultado con el primer número de la lista de números
        int resultado = numeros.get(0);

        // Iterar sobre los operadores y realizar la operación matemática correspondiente
        for (int i = 0; i < operadores.size(); i++) {
            char operador = operadores.get(i);
            int numero = numeros.get(i + 1);

            switch (operador) {
                case '+':
                    resultado += numero;
                    System.out.println(resultado);
                    break;
                case '-':
                    resultado -= numero;
                    System.out.println(resultado);
                    break;
                case '*':
                    resultado *= numero;
                    System.out.println(resultado);
                    break;
                case '/':
                    resultado /= numero;
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Operador no válido");
                    break;
            }
        }
        return resultado;
    }
    @Override
    public String toString() {
        return "Expresion{" + "elements=" + elements + '}';
    }
}