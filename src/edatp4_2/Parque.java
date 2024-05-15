/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatp4_2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author carba
 */
public class Parque {

    private int capacidadMax = 7;
    private int personasJugando = 0;
    private Queue<Integer> filaEntrada = new LinkedList<>();
    private Queue<Integer> filaMontaniaRusa = new LinkedList();
    private Queue<Integer> filaVueltaAlMundo = new LinkedList();
    private Queue<Integer> filaSalida = new LinkedList<>();

    public void registrarEntrada(int idVisitante) {
        if (!controlCapacidad()) {
            filaEntrada.add(idVisitante);
            personasJugando++;
            System.out.println("Visitante con ID " + idVisitante + " ha entrado al parque.");
        } else {
            System.out.println("El parque ha alcanzado su capacidad máxima. Entrada no permitida en este momento.");
        }
    }

    public boolean controlCapacidad() {
        boolean parquelleno = false;
        if (personasJugando < capacidadMax) {
            System.out.println("hay lugar disponible");

        } else {
            System.out.println("Parque lleno no se puede ingresar");
            parquelleno = true;
        }
        return parquelleno;
    }

    public void registroSalida(int idVisitante) {
        int contador = filaEntrada.size();
        while ((!filaEntrada.isEmpty()) && contador != 0) {
            if (idVisitante == filaEntrada.peek()) {
                filaSalida.add(idVisitante);
                filaEntrada.poll();
                personasJugando--;
                System.out.println("Visitante con ID " + idVisitante + " ha salido del parque.");
            } else {
                int aux = filaEntrada.poll();
//                System.out.println("No hay visitantes en la fila de entrada para salir del parque en este momento.");
                filaEntrada.add(aux);
            }
            contador--;
        }// eliminamos las personas en la montaña rusa cuando salen del parque
        int contMR = filaMontaniaRusa.size();
        while ((!filaMontaniaRusa.isEmpty()) && contador != 0) {
            if (idVisitante == filaMontaniaRusa.peek()) {
                filaSalida.add(idVisitante);
                filaEntrada.poll();
                filaMontaniaRusa.poll();
                personasJugando--;
                System.out.println("Visitante con ID " + idVisitante + " ha salido del parque.");
            } else {
                int aux = filaMontaniaRusa.poll();
                filaMontaniaRusa.add(aux);
            }
            contMR--;
        }// eliminamos las personas en la vuelta al mundo cuando salen del parque
        int contVM = filaVueltaAlMundo.size();
        while ((!filaVueltaAlMundo.isEmpty()) && contador != 0) {
            if (idVisitante == filaVueltaAlMundo.peek()) {
                filaSalida.add(idVisitante);
                filaEntrada.poll();
                filaVueltaAlMundo.poll();
                personasJugando--;
                System.out.println("Visitante con ID " + idVisitante + " ha salido del parque.");
            } else {
                int aux = filaVueltaAlMundo.poll();
                filaVueltaAlMundo.add(aux);
            }
            contMR--;
        }
    }
    
    // NroJuego = 1, Montaña Rusa  y NroJuego != 1 , Vuelta al mundo

    public void entradaAtraccionesPopulares(int idVisitante, int NroJuego) {
        if (NroJuego == 1) {
            filaMontaniaRusa.add(idVisitante);
            System.out.println("Visitante con ID " + idVisitante + "entro Montaña Rusa");
        } else {
            filaVueltaAlMundo.add(idVisitante);
            System.out.println("Visitante con ID " + idVisitante + "entro Vuelta al mundo");
        }

    }

    public void buscarVisitante(int idVisitante) {
        if (filaEntrada.contains(idVisitante)) {
            System.out.println("El visitante con ID " + idVisitante + " se encuentra en el parque");
        } else {
            if (filaMontaniaRusa.contains(idVisitante)) {
                System.out.println("El visitante con ID " + idVisitante + " se encuentra en la MOntaña Rusa");
            } else {
                if (filaVueltaAlMundo.contains(idVisitante)) {
                    System.out.println("El visitante con ID " + idVisitante + " se encuentra en la Vuelta al Mundo");
                }
            }
        }
        System.out.println("El visitante con ID " + idVisitante 
        + " se encuentra en el parque y no en las atracciones populares");
    }
}
