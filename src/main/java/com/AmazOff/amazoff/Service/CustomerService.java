package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.CustomerConvertor;
import com.AmazOff.amazoff.Models.Cart;
import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.Repository.CartRepository;
import com.AmazOff.amazoff.Repository.CustomerRepository;
import com.AmazOff.amazoff.RequestDTO.CustomerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CartRepository cartRepository;
    public String addCustomer(CustomerRequestDTO customerRequestDTO){

        Customer customer = CustomerConvertor.CustomerRequestDTOtoCustomer(customerRequestDTO);

        Cart cart = new Cart();
        cart.setCustomer(customer);
        customer.setCart(cart);
        
        customerRepository.save(customer);

        return "Customer with its corressponding cart added successfully";
    }
}
