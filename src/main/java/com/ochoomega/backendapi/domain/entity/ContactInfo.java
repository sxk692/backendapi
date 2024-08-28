package com.ochoomega.backendapi.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactInfo {
    String name;
    String phoneNumber;
    String email;
    String address;
    String customerNumber;
    String zipcode;
    String city;
    String state;
}
