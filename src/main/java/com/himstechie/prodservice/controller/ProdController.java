package com.himstechie.prodservice.controller;


import com.himstechie.prodservice.dto.ProdRequest;
import com.himstechie.prodservice.dto.ProdResponse;
import com.himstechie.prodservice.entity.Prod;
import com.himstechie.prodservice.service.ProdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProdController
{
    @Autowired
    private ProdService productService;


    @PostMapping("/")
    public void createProduct(@RequestBody ProdRequest prodRequest)
    {
        // log.info("Inside saveDepartment method of DepartmentController");
        productService.createProduct(prodRequest);   // Press Alt + Enter to create method in DepartmentService.java
    }


    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<ProdResponse> getAllProducts()
    {
        return productService.getAllProducts();
    }

}
