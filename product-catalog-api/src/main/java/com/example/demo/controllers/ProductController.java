package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final List<Product> products = new ArrayList<>();

  @GetMapping
  public List<Product> getAllProducts() {
    return products;
  }

  @PostMapping
  public ResponseEntity<Product> addProduct(@RequestBody Product product) {
    products.add(product);
    return new ResponseEntity<>(product, HttpStatus.CREATED);
  }
}
