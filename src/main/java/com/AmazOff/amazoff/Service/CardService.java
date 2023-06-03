package com.AmazOff.amazoff.Service;

import com.AmazOff.amazoff.Convertor.CardConvertor;
import com.AmazOff.amazoff.Models.Card;
import com.AmazOff.amazoff.Models.Customer;
import com.AmazOff.amazoff.Repository.CardRepository;
import com.AmazOff.amazoff.Repository.CustomerRepository;
import com.AmazOff.amazoff.RequestDTO.CardRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCard(CardRequestDTO cardRequestDTO) {
        Card card = CardConvertor.CardRequestDTOtoCard(cardRequestDTO);

        Customer customer = customerRepository.findById(cardRequestDTO.getCustomerId()).get();
        List<Card> cardList = customer.getCardList();
        cardList.add(card);
        customer.setCardList(cardList);
        card.setCustomer(customer);

        customerRepository.save(customer);

        return "Card with its corresponding customer has been successfully added";
    }
}
