package com.AmazOff.amazoff.ResponseDTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class CustomerResponseDTO {

    private String name;
    private int age;
    private String email;
    private String mobNo;
}
