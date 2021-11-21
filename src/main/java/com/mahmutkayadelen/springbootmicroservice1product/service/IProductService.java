package com.mahmutkayadelen.springbootmicroservice1product.service;

import com.mahmutkayadelen.springbootmicroservice1product.model.Product;

import java.util.List;

/**
 * @Author mahmutkayadelen
 * @create 20.11.2021  21:30
 */
public interface IProductService {
    public Product save(Product product);
    public void deleteProduct(Long productId);
    public List<Product> findAllProducts();
}
