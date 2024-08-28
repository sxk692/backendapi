package com.ochoomega.backendapi.rest.resources.mappers;

import com.ochoomega.backendapi.domain.entity.Contact;
import com.ochoomega.backendapi.rest.resources.v1.FormRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OchoOmegaMapper {
    @Mappings( {
        @Mapping(target = "name", expression = "java(formRequest.getContactInfo().getName())"),
            @Mapping(target = "phoneNumber", expression = "java(formRequest.getContactInfo().getPhoneNumber())"),
            @Mapping(target = "email", expression = "java(formRequest.getContactInfo().getEmail())"),
            @Mapping(target = "address", expression = "java(formRequest.getContactInfo().getAddress())"),
            @Mapping(target = "customerNumber", expression = "java(formRequest.getContactInfo().getCustomerNumber())"),
            @Mapping(target = "zipcode", expression = "java(formRequest.getContactInfo().getZipcode())"),
            @Mapping(target = "city", expression = "java(formRequest.getContactInfo().getCity())"),
            @Mapping(target = "state", expression = "java(formRequest.getContactInfo().getState())")
    })
    Contact formRequestToContact(FormRequest formRequest);
}
