package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.CustomerConvertor;
import com.AmazOff.amazoff.Exception.CustomerNotFoundException;
import com.AmazOff.amazoff.Exception.ExceptionType;
import com.AmazOff.amazoff.Exception.GeneralException;
import com.AmazOff.amazoff.Models.Cart;
import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.Repository.CustomerRepository;
import com.AmazOff.amazoff.RequestDTO.CustomerRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.CustomerResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(CustomerRequestDTO customerRequestDTO) {

        Customer customer = CustomerConvertor.CustomerRequestDTOtoCustomer(customerRequestDTO);

        Cart cart = new Cart();
        cart.setCustomer(customer);
        customer.setCart(cart);

        customerRepository.save(customer);

        return "Customer with its corresponding cart added successfully";
    }

    public Customer getCustomerById(int Id) throws GeneralException {

        Optional<Customer>  optionalCustomer = this.customerRepository.findById(Id);

        if(!optionalCustomer.isPresent()){
            throw new GeneralException(ExceptionType.CUSTOMER_NOT_FOUND, ExceptionType.CUSTOMER_NOT_FOUND_MSG);
        }

       return optionalCustomer.get();
    }
}
