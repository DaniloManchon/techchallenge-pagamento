package com.techchallege.pagamento.controller;

import com.techchallege.pagamento.usecase.PagamentoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    PagamentoUseCase pagamentoUseCase;

    @PostMapping
    ResponseEntity<String> pagar(){
        return pagamentoUseCase.pagar();
    }
}
