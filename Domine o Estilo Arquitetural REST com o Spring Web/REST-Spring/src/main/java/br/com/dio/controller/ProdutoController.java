package br.com.dio.controller;

import br.com.dio.entity.Produto;
import br.com.dio.exception.ProductNullException;
import br.com.dio.exception.ProductPriceException;
import br.com.dio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) throws Exception
    {
        produto = service.save(produto);

        return ResponseEntity.ok().body(produto);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<Produto> buscaProduto(@PathVariable Long id)
    {
        Produto produto = service.findById(id);

        return ResponseEntity.ok().body(produto);
    }

    @PostMapping(value = "/busca-todos")
    public ResponseEntity<List<Produto>> buscaTodosProdutos()
    {
        List<Produto> produtos = service.findAll();

        return ResponseEntity.ok().body(produtos);
    }


}
