package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.SellerConvertor;
import com.AmazOff.amazoff.Models.Seller;
import com.AmazOff.amazoff.Repository.SellerRepository;
import com.AmazOff.amazoff.RequestDTO.SellerRequestDTO;
import com.AmazOff.amazoff.RequestDTO.UpdateSellerNameDTO;
import com.AmazOff.amazoff.ResponseDTO.SellerResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    public String addSeller(SellerRequestDTO sellerRequestDTO) {

        Seller seller = SellerConvertor.SellerRequestDTOtoSeller(sellerRequestDTO);
        sellerRepository.save(seller);
        return "Seller Successfully added";
    }

    public SellerResponseDTO getSellerByPanCard(String panCard) {

        Seller sellerObjectByPanCard = sellerRepository.findByPanCard(panCard);

        SellerResponseDTO sellerResponseDTO = SellerConvertor.SellertoSellerResponseDTO(sellerObjectByPanCard);

        return sellerResponseDTO;
    }

    public List<SellerResponseDTO> getAllSeller() {

        List<Seller> sellerList = sellerRepository.findAll();
        List<SellerResponseDTO> sellerResponseDTOS = new ArrayList<>();

        for (Seller seller : sellerList) {

            SellerResponseDTO sellerResponseDTO = SellerConvertor.SellertoSellerResponseDTO(seller);
            sellerResponseDTOS.add(sellerResponseDTO);
        }

        return sellerResponseDTOS;
    }

    public String updateSellerName(UpdateSellerNameDTO updateSellerNameDTO) {

        Seller seller = sellerRepository.findById(updateSellerNameDTO.getId()).get();
        seller.setName(updateSellerNameDTO.getName());
        sellerRepository.save(seller);

        return "Seller has been Updated Successfully";
    }
}
