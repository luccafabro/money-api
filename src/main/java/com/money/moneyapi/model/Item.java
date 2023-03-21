package com.money.moneyapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "ITEM", schema = "MONEY")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Item {

    @Id
    @Column(name = "ITEM_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer itemId;

    @Column(name = "VALUE")
    private Double value;

    // Linkar com CATEGORY
    @Column(name = "CATEGORY_ID")
    private Integer categoryId;

    @Column(name = "INITIAL_DATE")
    private Timestamp initialDate;

    @Column(name = "FINAL_DATE")
    private Timestamp finalDate;

    @Column(name = "REGISTRATION_DATE")
    private Timestamp registrationDate;
}



