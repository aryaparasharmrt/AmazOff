package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.ProductConverter;
import com.AmazOff.amazoff.Enum.Category;
import com.AmazOff.amazoff.Models.Product;
import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.Repository.ProductRepository;
import com.AmazOff.amazoff.Repository.SellerRepository;
import com.AmazOff.amazoff.RequestDTO.ProductRequestDTO;
import com.AmazOff.amazoff.Exception.SellerNotFoundException;
import com.AmazOff.amazoff.ResponseDTO.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    ProductRepository productRepository;

    public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO) throws SellerNotFoundException {

        Seller seller;

        try{
            seller =  sellerRepository.findById(productRequestDTO.getSellerId()).get();
        } catch (Exception e){
            throw new SellerNotFoundException("Invalid Seller Id");
        }

        Product product = ProductConverter.productRequestDTOtoProduct(productRequestDTO);
        product.setSeller(seller);

        seller.getProductList().add(product);

        sellerRepository.save(seller);

        ProductResponseDTO productResponseDTO = ProductConverter.producttoProductResponseDTO(product);
        return productResponseDTO;
    }

    public List<ProductResponseDTO> getProductByCategory(Category category){

        List<Product> productList = productRepository.findByCategory(category);

        List<ProductResponseDTO> productResponseDTOS = new ArrayList<>();

        for(Product product : productList){
            ProductResponseDTO productResponseDTO = ProductConverter.producttoProductResponseDTO(product);
            productResponseDTOS.add(productResponseDTO);
        }

        return productResponseDTOS;
    }
}
