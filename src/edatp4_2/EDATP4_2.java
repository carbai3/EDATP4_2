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
        int cantEntrada = 0;
        int cant = 0;
        int visitSal;

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

                    if (cantEntrada == 0) {
                        System.out.println("Cuantos quiere ingresar?");
                        cantEntrada = scanner.nextInt();
                        for (int i = 1; i <= cantEntrada; i++) {
                            System.out.println("Se ingresan los visitantes...");
                            if (i != 14) {
                                parque.registrarEntrada(i);
                            }
                        }
                    } else {
                        System.out.println("Cuantos quiere ingresar? Recuerde que ya hay " + cantEntrada + " visitantes");
                        int aux = cantEntrada;
                        cantEntrada = scanner.nextInt();
                        for (int i = aux + 1; i <= aux + cantEntrada; i++) {
                            System.out.println("Se ingresan los visitantes...");
                            if (i != 14) {
                                parque.registrarEntrada(i);
                            }
                        }
                    }
                    cant = cant + cantEntrada;

                    break;
                case 2:
                    System.out.println("Salida de Visitantes del parque");
                    System.out.println("Que visitante quiere salir?");
                    visitSal = scanner.nextInt();
                    if (visitSal < cant) {
                        parque.registroSalida(visitSal);
                    }else{
                        System.out.println("El ID no existe");
                    }
                    break;
                case 4:
                    System.out.println("Ingreso a la Atraccion Montaña Rusa");
                    parque.entradaAtraccionesPopulares(6, 1);
                    parque.entradaAtraccionesPopulares(4, 1);
                    parque.entradaAtraccionesPopulares(1, 1);
                    break;
                case 5:
                    System.out.println("Ingreso a la Atraccion Vuelta al Mundo");
                    parque.entradaAtraccionesPopulares(2, 2);
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
        } while (opcion != 8);
    }
}
