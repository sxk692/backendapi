package com.ochoomega.backendapi.rest.resources.v1;

import com.ochoomega.backendapi.domain.entity.ContactInfo;
import com.ochoomega.backendapi.domain.entity.Specimen;
import com.ochoomega.backendapi.domain.entity.WorkOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Base64;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class FormRequest {
    String orderNumber;
    String pdfBlob;
    ContactInfo contactInfo;
    WorkOrder workOrder;
    Specimen specimen;
}
