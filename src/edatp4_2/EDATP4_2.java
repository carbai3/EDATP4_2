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
        Parque parque = new Parque();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("---Menú seleccione la opcion correspondiente-");
            System.out.println("Opcion 1. Ingreso de visitantes al parque");
            System.out.println("Opcion 2. Salida de visitantes al parque");
            System.out.println("Opcion 3. Registro de Salida de Visitantes");
            System.out.println("Opcion 4. Ingreso  atraccion Montaña Rusa ");
            System.out.println("Opcion 5. Ingreso  atraccion de Vuelta al MUndo");
            System.out.println("Opcion 6. Mostrar visitantes en las Atracciones Ppales");
            System.out.println("Opcion 7. Busqueda de Visitante");
            System.out.println("Opcion 8. Salir del sistema");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Se ingresan los visitantes");
                    parque.registrarEntrada(1);
                    parque.registrarEntrada(2);
                    parque.registrarEntrada(3);
                    parque.registrarEntrada(4);
                    parque.registrarEntrada(5);
                    parque.registrarEntrada(6);
                    parque.registrarEntrada(7);
                    parque.registrarEntrada(8);
                    parque.registrarEntrada(9);
                    parque.registrarEntrada(10);
                    parque.registrarEntrada(11);
                    parque.registrarEntrada(12);
                    parque.registrarEntrada(13);
                    parque.registrarEntrada(15);
                    parque.registrarEntrada(16);
                    parque.registrarEntrada(17);

                    break;
                case 2:
                    System.out.println("Salida de Visitantes del parque");
                    parque.registroSalida(5);
                    parque.registroSalida(3);
                    break;
                case 3:
                    System.out.println("Ha seleccionado la Opción 3");

                    break;
                case 4:
                    System.out.println("Ingreso a la Atracion Montaña Rusa");
                    parque.entradaAtraccionesPopulares(6, 1);
                    parque.entradaAtraccionesPopulares(4, 1);
                    parque.entradaAtraccionesPopulares(1, 1);
                    parque.entradaAtraccionesPopulares(4, 1);
                    parque.entradaAtraccionesPopulares(10, 1);
                    parque.entradaAtraccionesPopulares(11, 1);
                    break;

                case 5:
                    System.out.println("Ingreso a la Atracion Vuelta al Mundo");
                    parque.entradaAtraccionesPopulares(12, 2);
                    parque.entradaAtraccionesPopulares(14, 2);
                    parque.entradaAtraccionesPopulares(13, 2);
                    parque.entradaAtraccionesPopulares(14, 2);
                    parque.entradaAtraccionesPopulares(15, 2);
                    parque.entradaAtraccionesPopulares(16, 2);
                    break;
                case 6:
                    System.out.println("Ingreso a la Atracion Vuelta al Mundo");
                case 7:
                    System.out.println("Ingreso a la Atracion Vuelta al Mundo");
                case 8:
                    System.out.println("Saliendo del sitema")
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
