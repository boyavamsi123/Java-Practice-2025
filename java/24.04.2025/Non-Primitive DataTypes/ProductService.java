package com.company.ecommerce.services;

import com.company.ecommerce.models.Product;    


public class ProductService {
    
    public void printProductDetails(Product product) {
        product.displayProduct();
    }
}