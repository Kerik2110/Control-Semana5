package com.mycompany.control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

    Scanner leer = new Scanner(System.in);
    int num;

    public void validar() {
        while (true) {
            try {
                System.out.println("Ingrese un numero mayor o igual a dos digitos: ");
                num = leer.nextInt();
                if (num < 10) {
                    System.out.println("El numero ingresado no es de dos digitos.");
                    System.out.println("Intenta nuevamente.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es numero entero.");
                System.out.println("Intenta nuevamente.");
                leer.nextLine();
            }
        }
    }

    public boolean invertirNumero() {
        validar();
        
        String numeroStr = Integer.toString(num);
        String numeroInvertido = "";

        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            numeroInvertido += numeroStr.charAt(i);
        }
        System.out.println("El numero invertido es: " + numeroInvertido);
        return false;
    }
}
