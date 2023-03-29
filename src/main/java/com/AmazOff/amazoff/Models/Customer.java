package com.AmazOff.amazoff.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;
    private int age;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String mobNo;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    Card card;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    Cart cart;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<Ordered> orderedList = new ArrayList<>();


}
