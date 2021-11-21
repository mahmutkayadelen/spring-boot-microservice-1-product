package com.mahmutkayadelen.springbootmicroservice1product.controller;

import com.mahmutkayadelen.springbootmicroservice1product.model.Product;
import com.mahmutkayadelen.springbootmicroservice1product.util.ApiPathsConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mahmutkayadelen.springbootmicroservice1product.service.IProductService;

import java.util.List;

/**
 * @Author mahmutkayadelen
 * @create 20.11.2021  21:38
 */
@RestController
@RequestMapping(ApiPathsConst.version+ApiPathsConst.productCTRL)
public class ProductController {
    @Autowired
    private IProductService productService;
    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        return  new ResponseEntity<Product>(productService.save(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
    {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return  ResponseEntity.ok(productService.findAllProducts());
    }
}
