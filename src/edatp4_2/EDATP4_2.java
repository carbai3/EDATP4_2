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
public class EDATP4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Queue<Integer> filaEntrada = new LinkedList<>();
    Queue<Integer> filaJuegos = new LinkedList<>();
    Queue<Integer> filaSalida = new LinkedList<>();
    Parque parque= new Parque();
    parque.registrarEntrada(1);
    parque.registrarEntrada(2);
    parque.registrarEntrada(3);
    parque.registrarEntrada(4);
    parque.registrarEntrada(5);
    parque.registrarEntrada(6);
    parque.registrarEntrada(7);
    parque.registroSalida(3);
    
    }
    
}
