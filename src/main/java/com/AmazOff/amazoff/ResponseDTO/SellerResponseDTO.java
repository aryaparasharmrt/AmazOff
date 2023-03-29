package com.AmazOff.amazoff.ResponseDTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SellerResponseDTO {


    private String name;
    private int mobNo;
    private String email;
    private String panCard;

}
