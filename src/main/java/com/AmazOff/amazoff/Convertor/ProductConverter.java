package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Enum.ProductStatus;
import com.AmazOff.amazoff.Models.Product;
import com.AmazOff.amazoff.RequestDTO.ProductRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.ProductResponseDTO;

public class ProductConverter {

    public static Product productRequestDTOtoProduct(ProductRequestDTO productRequestDTO){

        return Product.builder()
                .name(productRequestDTO.getName())
                .quantity(productRequestDTO.getQuantity())
                .category(productRequestDTO.getCategory())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
        }

    public static ProductResponseDTO producttoProductResponseDTO(Product product){

        return ProductResponseDTO.builder()
                .name(product.getName())
                .quantity(product.getQuantity())
                .category(product.getCategory())
                .productStatus(product.getProductStatus())
                .build();
    }


}
