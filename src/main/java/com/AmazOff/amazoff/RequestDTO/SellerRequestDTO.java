package com.AmazOff.amazoff.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class SellerRequestDTO {

    private String name;
    private int mobNo;
    private String email;
    private String panCard;
}
