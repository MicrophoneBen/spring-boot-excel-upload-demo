package com.github.chen0040.bootslingshot.services;


import com.github.chen0040.bootslingshot.viewmodels.Product;

import java.util.List;


/**
 * Created by xschen on 9/11/2017.
 */
public interface ProductApi {
   public Product saveProduct(Product newProduct);
   public List<Product> findAll();
}
