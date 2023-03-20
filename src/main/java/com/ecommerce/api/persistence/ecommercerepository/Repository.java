package com.ecommerce.api.persistence.ecommercerepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.api.ecommerceentity.ProdutoEntity;


public interface Repository extends MongoRepository<ProdutoEntity, Long> {

    List<ProdutoEntity> findAllById();

    void save(Repository produto);

    //void save(EcommerceModel ecommerce);

}
