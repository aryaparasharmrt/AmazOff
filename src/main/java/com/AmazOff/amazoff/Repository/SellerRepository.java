package com.AmazOff.amazoff.Repository;

import com.AmazOff.amazoff.Models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{

     Seller findByPanCard(String panCard);

}
