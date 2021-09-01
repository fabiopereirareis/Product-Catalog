package com.digitalinnovationone.santander.productcatalog.repository;

import com.digitalinnovationone.santander.productcatalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Long> {
}
