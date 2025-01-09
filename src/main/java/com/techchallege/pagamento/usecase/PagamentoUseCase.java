package com.techchallege.pagamento.usecase;

import org.springframework.http.ResponseEntity;

public interface PagamentoUseCase {

    ResponseEntity<String> pagar();
}
