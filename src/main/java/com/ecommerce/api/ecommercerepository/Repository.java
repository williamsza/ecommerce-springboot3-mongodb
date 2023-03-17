package com.ecommerce.api.ecommercerepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.api.econerceentity.Entity;


public interface Repository extends JpaRepository<Entity, Long> {

}
