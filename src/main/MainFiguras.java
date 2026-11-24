package main;

import modelo.Figura;
import modelo.Circulo;
import modelo.Rectangulo;

public class MainFiguras {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[4];

        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(3);
        figuras[3] = new Rectangulo(8, 5);

        System.out.println("===== AREAS DE LAS FIGURAS =====");

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Área de la figura " + (i + 1) + ": "
                    + figuras[i].calcularArea());
        }
    }
}