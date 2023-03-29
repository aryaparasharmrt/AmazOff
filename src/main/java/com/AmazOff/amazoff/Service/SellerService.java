package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.SellerConvertor;
import com.AmazOff.amazoff.Convertor.SellerResponseDTOConvertor;
import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.Repository.SellerRepository;
import com.AmazOff.amazoff.RequestDTO.SellerRequestDTO;
import com.AmazOff.amazoff.ResponseDTO.SellerResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;
    public String addSeller(SellerRequestDTO sellerRequestDTO){

        Seller seller = SellerConvertor.SellerRequestDTOtoSeller(sellerRequestDTO);
        sellerRepository.save(seller);
        return "Seller Successfully added";
    }

    public SellerResponseDTO getSellerByPanCard(String panCard){

        Seller sellerObjectByPanCard = sellerRepository.findByPanCard(panCard);

        SellerResponseDTO sellerResponseDTO = SellerResponseDTOConvertor.SellertoSellerResponseDTO(sellerObjectByPanCard);
        return sellerResponseDTO;
    }
}
