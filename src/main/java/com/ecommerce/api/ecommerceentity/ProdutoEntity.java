package com.ecommerce.api.ecommerceentity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Produto")

public class ProdutoEntity{
    
    @Id
    private Long id;
    private String produto;
    private String addCarrinho;
  
}
