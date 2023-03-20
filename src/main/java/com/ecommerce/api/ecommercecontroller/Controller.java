package com.ecommerce.api.ecommercecontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.api.ecommerceentity.ProdutoEntity;
import com.ecommerce.api.persistence.ecommercerepository.Repository;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Repository produto;

    @GetMapping("/produto")
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> buscarTodosProduto() {
        return produto.findAll();
    }

    @GetMapping()
    public Optional<ProdutoEntity> buscarProdutoPorId(@PathVariable Long id, Iterable<Long> Long) {
        return produto.findById(id);

    }

    @PostMapping
    public void cadastrarProduto(@RequestBody ProdutoEntity entity) {
        produto.save(produto);

    }

    @DeleteMapping("/{id}")
    public void excluirProdutoPorId(@PathVariable Long id) {
        produto.deleteById(id);

    }
}
