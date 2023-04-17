package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.CustomerConvertor;
import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.Repository.CustomerRepository;
import com.AmazOff.amazoff.RequestDTO.CustomerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
//    public String addCustomer(CustomerRequestDTO customerRequestDTO){
//
//        Customer customer = CustomerConvertor.CustomerRequestDTOtoCustomer(customerRequestDTO);
//
//        customerRepository
//    }
}
