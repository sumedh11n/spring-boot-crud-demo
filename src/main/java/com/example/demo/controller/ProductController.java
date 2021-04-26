package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct (@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts (@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductsById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Product getProductsByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public void deleteProductsById(@PathVariable int id){
        productService.deleteProductByID(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
}
