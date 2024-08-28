package com.ochoomega.backendapi.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class SpecimenGroups {
    String lineNumber;
    String exposureImage;
    ExposureType exposureType;
    SpecimenList specimenList;
}
