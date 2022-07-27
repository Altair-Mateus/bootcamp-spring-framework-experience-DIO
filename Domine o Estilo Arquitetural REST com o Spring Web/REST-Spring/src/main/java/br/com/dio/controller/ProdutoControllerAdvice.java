package br.com.dio.controller;

import br.com.dio.exception.ProductNullException;
import br.com.dio.exception.ProductPriceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.ResponseEntity.status;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> capturaErroNull()
    {
        Map<String, Object> body = new HashMap<String, Object>();

        body.put("message", "Verifique os campos do Produto");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<Object> capturaErroPreco()
    {
        Map<String, Object> body = new HashMap<String, Object>();

        body.put("message", "Verifique o preço do Produto");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

}
