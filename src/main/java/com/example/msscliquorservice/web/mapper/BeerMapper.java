package com.example.msscliquorservice.web.mapper;

import com.example.msscliquorservice.domain.Beer;
import com.example.msscliquorservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);
}
