package com.digitalinnovationone.santander.shoppingCart.controller;

import com.digitalinnovationone.santander.shoppingCart.model.ShopCart;
import com.digitalinnovationone.santander.shoppingCart.repository.ShopCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/shopcart")
public class ShopCartController {

    @Autowired
    private ShopCartRepository shopCartRepository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ShopCart addItem(@RequestBody ShopCart shopCart){
        return shopCartRepository.save(shopCart);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<ShopCart> findById(@PathVariable("id") Long id){
        return shopCartRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Long id ){
        shopCartRepository.deleteById(id);
    }
}
