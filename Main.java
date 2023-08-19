/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Título de la Película", 120, 12, "Director Nombre");
        Espectador espectador = new Espectador("Nombre Espectador", 20, 50);
        Cine cine = new Cine(pelicula, 10, 8, 9);

        cine.venderEntrada(espectador, 5, 3);
        cine.mostrarAsientos();
    }
}

