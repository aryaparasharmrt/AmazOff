package com.AmazOff.amazoff.Repository;

import com.AmazOff.amazoff.Models.Cart;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
