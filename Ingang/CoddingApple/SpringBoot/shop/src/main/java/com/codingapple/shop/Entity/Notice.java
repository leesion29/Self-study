package com.codingapple.shop.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long Id;

    @Column(name = "title", length = 100)
    String title;

    @Column(name = "date")
    LocalDate date;
}
