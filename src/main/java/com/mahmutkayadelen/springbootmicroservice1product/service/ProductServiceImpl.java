package com.mahmutkayadelen.springbootmicroservice1product.service;

import com.mahmutkayadelen.springbootmicroservice1product.model.Product;
import org.springframework.stereotype.Service;
import com.mahmutkayadelen.springbootmicroservice1product.repository.IProductRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author mahmutkayadelen
 * @create 20.11.2021  21:30
 */

@Service
public class ProductServiceImpl implements  IProductService {

   private IProductRepository productRepository;
   public ProductServiceImpl(IProductRepository productRepository)
   {
       this.productRepository = productRepository;
   }

    @Override
    public Product save(Product product) {
       product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
