package com.AmazOff.amazoff.Controller;

import com.AmazOff.amazoff.Models.Card;
import com.AmazOff.amazoff.Repository.CardRepository;
import com.AmazOff.amazoff.RequestDTO.CardRequestDTO;
import com.AmazOff.amazoff.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("card")
public class CardController {

    @Autowired
    CardService cardService;

    @PostMapping("/add_Card")
    public String addCard(@RequestBody CardRequestDTO cardRequestDTO){
        return cardService.addCard(cardRequestDTO);
    }
}

//Temporary Changes made
