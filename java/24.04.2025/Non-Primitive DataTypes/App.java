package com.company.ecommerce;

import com.company.ecommerce.models.Product;
import com.company.ecommerce.services.ProductService;

public class App {
    public static void main(String[] args) {
        Product p = new Product(1, "Smartphone", 499.99);
        ProductService service = new ProductService();
        service.printProductDetails(p);
    }
}