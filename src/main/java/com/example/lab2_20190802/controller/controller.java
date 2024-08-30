package com.example.lab2_20190802;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// mostrar la pagina principal con un get//
public class controller {
    @GetMapping(value = "/configuracion")
    public String configuracion(){
        return "configuracion" ;
    }
    //almacenar toda la informacion que ingrese el usuario //
@PostMapping(value= "/configuracionBingo")
    public String configuracionBingo(){
        return "configuracion";
}

}
