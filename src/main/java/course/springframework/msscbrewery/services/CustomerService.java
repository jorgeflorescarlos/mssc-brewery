package course.springframework.msscbrewery.services;

import course.springframework.msscbrewery.web.model.BeerDto;
import course.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by jorge on 24/09/23
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
