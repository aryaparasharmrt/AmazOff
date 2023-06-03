package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.RequestDTO.CustomerRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.CustomerResponseDTO;

public class CustomerConvertor {

    public static Customer CustomerRequestDTOtoCustomer(CustomerRequestDTO customerRequestDTO){

        return Customer.builder()
                .name(customerRequestDTO.getName())
                .age(customerRequestDTO.getAge())
                .mobNo(customerRequestDTO.getMobNo())
                .email(customerRequestDTO.getEmail())
                .build();
    }

    public static CustomerResponseDTO CustomertoCustomerResponseDTO(Customer customer){

        return CustomerResponseDTO.builder()
                .name(customer.getName())
                .age(customer.getAge())
                .mobNo(customer.getMobNo())
                .email(customer.getEmail())
                .build();
    }
}
