package com.example.msscliquorservice.bootstrap;

import com.example.msscliquorservice.domain.Beer;
import com.example.msscliquorservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0)
        {
            beerRepository.save(Beer.builder().
                    beerName("Mango Bob").
                    beerStyle("IPA")
                    .minOnHand(12)
                    .quantityToBrew(200).
                    price(new BigDecimal("12.95"))
                    .upc(370000000L).build());

            beerRepository.save(Beer.builder().
                    beerName("Galaxy Cat").
                    beerStyle("PALE_ALE")
                    .minOnHand(10)
                    .quantityToBrew(100).
                            price(new BigDecimal("10.95"))
                    .upc(170000000L).build());

        }
        System.out.println("Loaded Beers"+beerRepository.count());
    }


}
