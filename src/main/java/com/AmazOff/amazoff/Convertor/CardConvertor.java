package com.AmazOff.amazoff.Convertor;

import com.AmazOff.amazoff.Models.Card;
import com.AmazOff.amazoff.RequestDTO.CardRequestDTO;

public class CardConvertor {

    public static Card CardRequestDTOtoCard(CardRequestDTO cardRequestDTO){

        return Card.builder()
                .cardNo(cardRequestDTO.getCardNo())
                .cvv(cardRequestDTO.getCvv())
                .cardType(cardRequestDTO.getCardType())
                .build();
    }
}
