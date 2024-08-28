package com.ochoomega.backendapi.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class TestOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

}
