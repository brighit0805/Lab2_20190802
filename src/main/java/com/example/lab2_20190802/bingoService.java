package com.example.lab2_20190802;
//esta clase manejara toda la logica del bingo//
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class bingoService {
        private List<bingoCard> cartas;
        private List<Integer> dibujaNumeros;

        public bingoService(int cardSize, int numCards) {
            this.cartas = new ArrayList<>();
            this.dibujaNumeros = new ArrayList<>(); //creo las listas de los numeros //
            for (int i = 0; i < numCards; i++) {
                cartas.add(new bingoCard(cardSize));
            }
        }

        public List<bingoCard> getCartas() { //getters
            return cartas;
        }
        public List<Integer> getDibujaNumeros() {
            return dibujaNumeros;
        }
        public void addNumber(int number) {
            dibujaNumeros.add(number);
    }
    public boolean checkWin(bingoService card) { //logica para ver quien es el ganador/
        return dibujaNumeros.containsAll(cartas.getNumbers());
    }
    }
