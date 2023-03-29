package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.ResponseDTO.SellerResponseDTO;

public class SellerResponseDTOConvertor {

    public static SellerResponseDTO SellertoSellerResponseDTO(Seller seller){

        return SellerResponseDTO.builder()
                .name(seller.getName())
                .mobNo(seller.getMobNo())
                .email(seller.getEmail())
                .panCard(seller.getPanCard())
                .build();
    }
}
