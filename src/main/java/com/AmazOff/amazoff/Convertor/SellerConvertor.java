package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.RequestDTO.SellerRequestDTO;

public class SellerConvertor {

    public static Seller SellerRequestDTOtoSeller(SellerRequestDTO sellerRequestDTO){

        return Seller.builder()
                .name(sellerRequestDTO.getName())
                .email(sellerRequestDTO.getEmail())
                .mobNo(sellerRequestDTO.getMobNo())
                .panCard(sellerRequestDTO.getPanCard())
                .build();
    }
}
