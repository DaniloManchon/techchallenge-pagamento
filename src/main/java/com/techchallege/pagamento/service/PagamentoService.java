package com.techchallege.pagamento.service;

import com.techchallege.pagamento.usecase.PagamentoUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class PagamentoService implements PagamentoUseCase {

    public ResponseEntity<String> pagar() {
        return new ResponseEntity<>("pago", HttpStatus.OK);
    }
}
