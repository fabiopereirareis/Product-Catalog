package com.digitalinnovationone.santander.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int amount;

}
