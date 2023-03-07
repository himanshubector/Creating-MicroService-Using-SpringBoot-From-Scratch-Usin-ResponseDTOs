package com.himstechie.prodservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProdResponse
{
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

}
