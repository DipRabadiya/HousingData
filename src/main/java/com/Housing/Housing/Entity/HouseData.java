package com.Housing.Housing.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HouseData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int bedrooms;
    private int bathrooms;
    private int squareFootage;
    private String location;
    private int salePrice;
}