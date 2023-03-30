package com.AmazOff.amazoff.RequestDTO;

import com.AmazOff.amazoff.Enum.Category;
import com.AmazOff.amazoff.Models.Seller;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductRequestDTO {

    private String name;

    private int quantity;

    private Category category;

    private int sellerId;
}
