package com.mycompany.control;

import java.util.Scanner;

public class Control {
    
    public static void main(String[] args) {
        int menu = 0;
        while (menu == 0) {
            System.out.println("Bienvenido a su programa");
            System.out.println("1- Ingresar num y retornar");
            System.out.println("2- Salir");

            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Metodos ingresarNum = new Metodos();
                    ingresarNum.invertirNumero();
                    break;
                case 2:
                    System.out.println("Gracias por utilizar el programa");
                    menu = 1;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente");
            }
        }
    }
}
