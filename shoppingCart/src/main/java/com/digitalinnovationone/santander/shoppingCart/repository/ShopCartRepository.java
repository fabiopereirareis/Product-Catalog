package com.digitalinnovationone.santander.shoppingCart.repository;

import com.digitalinnovationone.santander.shoppingCart.model.ShopCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCartRepository extends JpaRepository<ShopCart,Long> {
}
