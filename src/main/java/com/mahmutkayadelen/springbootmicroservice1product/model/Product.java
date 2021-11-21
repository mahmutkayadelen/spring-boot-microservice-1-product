package com.mahmutkayadelen.springbootmicroservice1product.model;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;


/**
 * @Author mahmutkayadelen
 * @create 20.11.2021  21:15
 */
@Entity
@Table(name = "product")
@Data
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "create_time", nullable = false)
    @JsonIgnore
    private LocalDateTime createTime;
}