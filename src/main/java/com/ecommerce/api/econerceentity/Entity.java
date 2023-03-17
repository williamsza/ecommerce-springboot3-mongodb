package com.ecommerce.api.econerceentity;

import lombok.Data;

@Data
//@Entity
public class Entity {
    
    @id
    private Long id;
    private String produto;
    private String addCarrinho;
}
