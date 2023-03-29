package com.AmazOff.amazoff.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ordered")
public class Ordered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @CreationTimestamp
    Date OrderDate;

    private int totalCost;
    private int deliveryCharge;
    private String cardUsedForPayment;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @OneToMany(mappedBy = "ordered", cascade = CascadeType.ALL)
    List<Item> itemList = new ArrayList<>();

}
