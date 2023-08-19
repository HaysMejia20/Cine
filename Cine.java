/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Cine {
    public Pelicula pelicula;
    public double precioEntrada;
    public int filas;
    public int columnas;
    public Asiento[][] asientos;

    public Cine(Pelicula pelicula, double precioEntrada, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.filas = filas;
        this.columnas = columnas;
        this.asientos = new Asiento[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                this.asientos[fila][columna] = new Asiento(fila + 1, columna);
            }
        }
    }

    public void mostrarAsientos() {
        for (int fila = filas - 1; fila >= 0; fila--) {
            for (int columna = 0; columna < columnas; columna++) {
                Asiento asiento = asientos[fila][columna];
                if (asiento.ocupado) {
                    System.out.print("X ");
                } else {
                    System.out.print((fila + 1) + " " + (char) (65 + columna) + " ");
                }
            }
            System.out.println();
        }
    }

    public void venderEntrada(Espectador espectador, int fila, int columna) {
        if (fila < 1 || fila > filas || columna < 0 || columna >= columnas) {
            System.out.println("Asiento inválido.");
            return;
        }

        Asiento asiento = asientos[filas - fila][columna];
        if (asiento.ocupado) {
            System.out.println("El asiento ya está ocupado.");
            return;
        }

        if (espectador.edad < pelicula.edadMinima) {
            System.out.println("El espectador no cumple con la edad mínima para ver la película.");
            return;
        }

        if (espectador.dinero < precioEntrada) {
            System.out.println("El espectador no tiene suficiente dinero para comprar la entrada.");
            return;
        }

        asiento.ocupado = true;
        espectador.dinero -= precioEntrada;
        System.out.println("¡Entrada vendida! Disfruta de la película " + pelicula.titulo + ".");
    }
}

