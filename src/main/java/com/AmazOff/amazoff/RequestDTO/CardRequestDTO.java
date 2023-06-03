package com.AmazOff.amazoff.RequestDTO;

import com.AmazOff.amazoff.Enum.CardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardRequestDTO {

    private String cardNo;
    private int cvv;
    private int customerId;
    private CardType cardType;
}
