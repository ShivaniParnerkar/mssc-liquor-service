package com.example.msscliquorservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID beerId;
    private String beerName;

    private Long upc;
    private BigDecimal price;
    private  Integer version;
    private Integer quantityOnHand;

    private BeerStyleEnum beerStyle;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
}
