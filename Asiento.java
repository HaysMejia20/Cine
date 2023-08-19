/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Asiento {
    public int fila;
    public int columna;
    public boolean ocupado;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }
}

