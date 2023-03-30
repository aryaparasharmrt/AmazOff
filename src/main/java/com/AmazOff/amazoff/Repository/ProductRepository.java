package com.AmazOff.amazoff.Repository;

import com.AmazOff.amazoff.Enum.Category;
import com.AmazOff.amazoff.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategory(Category category);
}
