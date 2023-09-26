package course.springframework.msscbrewery.services;

import course.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jorge on 23/09/23
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
