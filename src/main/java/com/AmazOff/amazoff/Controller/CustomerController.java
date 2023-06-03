package com.AmazOff.amazoff.Controller;

import com.AmazOff.amazoff.Exception.CustomerNotFoundException;
import com.AmazOff.amazoff.Exception.ExceptionType;
import com.AmazOff.amazoff.Exception.GeneralException;
import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.RequestDTO.CustomerRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.CustomerResponseDTO;
import com.AmazOff.amazoff.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add_customer")
    public String addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        return customerService.addCustomer(customerRequestDTO);
    }

    @GetMapping("/get_customerByID/{Id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int Id) throws GeneralException {
        Customer customer = this.customerService.getCustomerById(Id);
        return ok(customer);
    }
}
