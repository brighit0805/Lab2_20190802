package com.example.lab2_20190802.controller;

import com.example.lab2_20190802.bingoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// mostrar la pagina principal con un get//
public class controller {
    private bingoService currentGame;
    @GetMapping(value = "/configuracion")
    public String configuracion(){
        return "configuracion" ;
    }
    //almacenar toda la informacion que ingrese el usuario //

    @PostMapping (value = "/comienzaJuego") //guarda valores con el Post //
        public String (@RequestParam("cardSize") int cardSize,
                       @RequestParam ("numCards") int numCards, Model model){
        currentGame = new bingoService(cardSize, numCards);
        model.addAttribute("cards", currentGame.getCartas());
        return "game"; //retorname a la vista de game o sea la del juego //
    }
    //hacemos otro post mapping para poder guardar los numeros que ingresa ek usuario
    @PostMapping (value = "/agregaNumero")
    public String addNumber(@RequestParam("number") int number, Model model) {
        currentGame.addNumber(number);
        for (bingoCard:
             currentGame.getCartas()) { //para cada cartilla
            if (currentGame.checkWin(card)) {
                model.addAttribute("winner", card);
                return "game";
            }
        }
    }
        @PostMapping (value = "/gameOver) //para la interfaz de juego terminado
        public String restartGame() {
            return "/gameOver";

    }



}
