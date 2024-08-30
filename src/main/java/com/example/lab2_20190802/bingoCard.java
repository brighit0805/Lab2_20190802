package com.example.lab2_20190802;
//esta clase representará una tarjeta de Bingo//
import java.util.HashSet;
import java.util.Set;

public class bingoCard {
    private int tamaño;
    private Set<Integer> numeros; //uso set en vez de list o crear un array para que no se duplique numeros//

    public bingoCard(int tamaño) {
        //creamos el objeto //
        this.tamaño = tamaño;
        this.numeros = new HashSet<>(); // un hash no permite la repeticion de numeros para la tarjeta de bingo//
        generateNumbers();
    }

    private void generateNumbers() { //metodo que nos permitirá crear numeros aleatorios//
        while (numeros.size() < tamaño * tamaño) {
            //hago uso de la funcio math random para poder asignar numeros aleatorios//
            int number = (int) (Math.random() * 99) + 1;
            numeros.add(number);
        }
    }

    public Set<Integer> getNumbers() {
        return numeros;
    }

    public int getSize() {
        return tamaño;
    }
}
