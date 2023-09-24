package course.springframework.msscbrewery.services;

import course.springframework.msscbrewery.web.model.BeerDto;
import course.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jorge on 24/09/23
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }
}
