package com.ecommerce.api.ecommerceservice;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.api.ecommerceentity.ProdutoEntity;
import com.ecommerce.api.persistence.ecommercerepository.Repository;

@Service
public class Seivice {

    private Repository produto;

    public List<ProdutoEntity> buscarTodosProduto(Repository produto) {
        return produto.findAll();

    }

    public void buscarProdutoPorId(@PathVariable Long id) {
        produto.findById(id);
    }

    public void cadastrarProduto(@RequestBody ProdutoEntity ecommerce) {
        produto.save(ecommerce);
    }

    public void alterarProduto(@RequestBody Object Produto) {

    }

    //public void excluirProdutoPorId();

}
