package com.himstechie.prodservice.service;

import com.himstechie.prodservice.dto.ProdRequest;
import com.himstechie.prodservice.dto.ProdResponse;
import com.himstechie.prodservice.entity.Prod;
import com.himstechie.prodservice.repository.ProdRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
public class ProdService
{
    @Autowired
    private ProdRepository productRepository;

    public void createProduct(ProdRequest prodRequest)
    {
        Prod product = Prod.builder().name(prodRequest.getName()).description(prodRequest.getDescription())
                                        .price(prodRequest.getPrice()).build();

        productRepository.save(product);

        log.info("Product {} is saved......",product.getId());

    }


    public List<ProdResponse> getAllProducts()
    {
        List<Prod> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());

    }

    private ProdResponse mapToProductResponse(Prod product)
    {
        return ProdResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }



}
