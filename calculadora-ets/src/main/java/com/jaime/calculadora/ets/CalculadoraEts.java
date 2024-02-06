/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.jaime.calculadora.ets;

/**
 *
 * @author cfgs1dam
 */
public class CalculadoraEts {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(3 % 1);
        try {
            division(5,0);
        } catch (Exception ex) {
            System.out.println("No se puede realizar la división.");
        }
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static int division(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Error. No se puede dividir entre 0.");
        }
        return a / b;
    }

    public static int potencia(int a, int b) {
        int resultado = 1;
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            return 0;
        }
        if (a == 0 && b != 0) {
            return 0;
        }
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
    
    public static boolean esPrimo (int a) throws Exception {
        if (a <= 1) {
            throw new Exception("Un número igual o menor a 1 no es primo, ni no primo, es inválido.");
        }
        boolean esPrimo = true;
        int resto;
        for (int i = 2; i < a; i++) {
            resto = a % i;
            if (resto == 0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }
}
