package com.AmazOff.amazoff.Controller;

import com.AmazOff.amazoff.Enum.Category;
import com.AmazOff.amazoff.RequestDTO.ProductRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.ProductResponseDTO;
import com.AmazOff.amazoff.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("add_product")
    public ResponseEntity addProduct(@RequestBody ProductRequestDTO productRequestDTO){

        ProductResponseDTO productResponseDTO;

        try{
            productResponseDTO = productService.addProduct(productRequestDTO);
        }catch(Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(productResponseDTO, HttpStatus.ACCEPTED);
    }

    @GetMapping("get_ProductByCategory/{category}")
    public List<ProductResponseDTO> getProductByCategory(@PathVariable Category category){
        return productService.getProductByCategory(category);
    }


}
