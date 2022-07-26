package br.com.dio.controller;

import br.com.dio.entity.Produto;
import br.com.dio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto)
    {
        produto = service.save(produto);

        return ResponseEntity.ok().body(produto);
    }

}
