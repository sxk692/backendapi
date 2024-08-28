package com.ochoomega.backendapi.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;

@Entity
@Table
@Getter
@Setter
public class ActiveRetired {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

}
