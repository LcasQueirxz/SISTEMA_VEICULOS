package main;

import classes.*;

public class Main {

    public static void main(String[] args) {
        // Criando objetos das classes de veiculos
        automovel automovel = new automovel("Civic", 2020, "Honda", "Preto", 15000, 5, "ABS", true);
        motocicleta motocicleta = new motocicleta("Ninja", 2019, "Kawasaki", "Verde", 8000, 650, 70);
        caminhao caminhao = new caminhao("FH", 2018, "Volvo", "Branco", 120000, 3, 25000);
        bicicleta bicicleta = new bicicleta("Mountain Bike", "Caloi", "Vermelho", "Aluminio", 21, true);
        skate skate = new skate("Street", "Element", "Azul", "PU");

        // Exibindo os comandos INSERT no console
        System.out.println(automovel.gerarInsert());
        System.out.println(motocicleta.gerarInsert());
        System.out.println(caminhao.gerarInsert());
        System.out.println(bicicleta.gerarInsert());
        System.out.println(skate.gerarInsert());
    }
}

