package com.mahmutkayadelen.springbootmicroservice1product.repository;

import com.mahmutkayadelen.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author mahmutkayadelen
 * @create 20.11.2021  21:27
 */
public interface IProductRepository extends JpaRepository<Product,Long> {

}
