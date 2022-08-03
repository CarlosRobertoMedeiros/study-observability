package br.com.roberto.msclientes.transportlayers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteRest {

    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok()
                //.header("conta", "123456")
                .body("Olá Cliente");
    }

    @GetMapping("/erro")
    public ResponseEntity<String> helloErro(){
        return ResponseEntity.ok()
                //.header("conta", "123456")
                .body("Erro no Cliente");
    }

}
