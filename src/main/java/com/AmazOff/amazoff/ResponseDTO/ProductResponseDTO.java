package com.AmazOff.amazoff.ResponseDTO;

import com.AmazOff.amazoff.Enum.Category;
import com.AmazOff.amazoff.Enum.ProductStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponseDTO {

    private String name;
    private int quantity;
    private Category category;
    private ProductStatus productStatus;
}
