package com.AmazOff.amazoff.Repository;

import com.AmazOff.amazoff.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

}
