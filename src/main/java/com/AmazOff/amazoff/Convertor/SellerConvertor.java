package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.RequestDTO.SellerRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.SellerResponseDTO;

public class SellerConvertor {

    public static Seller SellerRequestDTOtoSeller(SellerRequestDTO sellerRequestDTO){

        return Seller.builder()
                .name(sellerRequestDTO.getName())
                .email(sellerRequestDTO.getEmail())
                .mobNo(sellerRequestDTO.getMobNo())
                .panCard(sellerRequestDTO.getPanCard())
                .build();
    }
    public static SellerResponseDTO SellertoSellerResponseDTO(Seller seller){

            return SellerResponseDTO.builder()
                    .name(seller.getName())
                    .mobNo(seller.getMobNo())
                    .email(seller.getEmail())
                    .panCard(seller.getPanCard())
                    .build();

    }

}
