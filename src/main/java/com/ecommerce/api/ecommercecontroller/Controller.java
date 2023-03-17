package com.ecommerce.api.ecommercecontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.ecommerce.api.ecommercerepository.Repository;
import com.ecommerce.api.econerceentity.Entity;

import lombok.val;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class Controller {

    @Autowired
    // Seivice Service;
    Repository repository;

    @GetMapping("/produtos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Entity> buscarTodosProduto() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public void buscarProdutoPorId(@PathVariable Long id) {

    }

    @PostMapping
    public void cadastrarProduto(@RequestBody Object Produto) {

    }

    @PutMapping
    public void alterarProduto(@RequestBody Object Produto) {

    }

    @DeleteMapping("/{id}")
    public void excluirProdutoPorId(@PathVariable Long id) {

    }
}
