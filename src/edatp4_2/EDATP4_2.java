/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatp4_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author carba
 */
public class EDATP4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> filaEntrada = new LinkedList<>();
        Queue<Integer> filaJuegos = new LinkedList<>();
        Queue<Integer> filaSalida = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        Parque parque = new Parque();
        int opcion;
        String continuar;

        do {
            System.out.println("---Menú seleccione la opcion correspondiente---");
            System.out.println("Opcion 1. Ingreso de visitantes al parque");
            System.out.println("Opcion 2. Salida de visitantes al parque");
            System.out.println("Opcion 4. Ingreso a atraccion Montaña Rusa");
            System.out.println("Opcion 5. Ingreso a atraccion de Vuelta al Mundo");
            System.out.println("Opcion 6. Mostrar visitantes en las Atracciones Principales");
            System.out.println("Opcion 7. Busqueda de Visitante");
            System.out.println("Opcion 8. Salir del sistema");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Se ingresan los visitantes...");
                    for (int i = 1; i <= 17; i++) {
                        if (i != 14) parque.registrarEntrada(i);
                    }
                    parque.registrarEntrada(5);
                    break;
                case 2:
                    System.out.println("Salida de Visitantes del parque");
                    parque.registroSalida(5);
                    parque.registroSalida(3);
                    break;
                case 4:
                    System.out.println("Ingreso a la Atraccion Montaña Rusa");
                    parque.entradaAtraccionesPopulares(6, 1);
                    parque.entradaAtraccionesPopulares(4, 1);
                    parque.entradaAtraccionesPopulares(1, 1);
                    parque.entradaAtraccionesPopulares(10, 1);
                    parque.entradaAtraccionesPopulares(11, 1);
                    break;
                case 5:
                    System.out.println("Ingreso a la Atraccion Vuelta al Mundo");
                    parque.entradaAtraccionesPopulares(12, 2);
                    parque.entradaAtraccionesPopulares(14, 2);
                    parque.entradaAtraccionesPopulares(13, 2);
                    parque.entradaAtraccionesPopulares(15, 2);
                    parque.entradaAtraccionesPopulares(16, 2);
                    break;
                case 6:
                    System.out.println("Visitantes en las atracciones populares:");
                    parque.mostrarVisitantesEnAtraccionesPpales();
                    break;
                case 7:
                    System.out.print("Ingrese el ID del visitante a buscar: ");
                    int idBuscado = scanner.nextInt();
                    parque.buscarVisitante(idBuscado);
                    break;
                case 8:
                    System.out.println("Saliendo del sistema");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion !=8);
    }
}


