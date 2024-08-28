package com.ochoomega.backendapi.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Specimen {
    String location;
    String mountedBy;
    String exposureDate;
    String address;
    String customerNumber;
    String zipcode;
    String city;
    String state;
    SpecimenGroups specimenGroups;
}
