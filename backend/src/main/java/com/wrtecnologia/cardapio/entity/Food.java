package com.wrtecnologia.cardapio.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "foods")
@Table(name = "foods")
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String image;
    private Double price;
}
