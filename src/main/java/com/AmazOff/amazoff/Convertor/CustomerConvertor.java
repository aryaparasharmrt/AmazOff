package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.RequestDTO.CustomerRequestDTO;

public class CustomerConvertor {

    public static Customer CustomerRequestDTOtoCustomer(CustomerRequestDTO customerRequestDTO){

        return Customer.builder()
                .name(customerRequestDTO.getName())
                .age(customerRequestDTO.getAge())
                .mobNo(customerRequestDTO.getMobNo())
                .email(customerRequestDTO.getEmail())
                .build();
    }
}
