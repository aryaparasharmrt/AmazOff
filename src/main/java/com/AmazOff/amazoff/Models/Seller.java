package com.AmazOff.amazoff.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "seller")
public class Seller {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private int mobNo;

    @Column(unique = true)
    private String panCard;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();


}
