package com.ochoomega.backendapi.rest.resources;


import com.ochoomega.backendapi.domain.entity.Contact;
import com.ochoomega.backendapi.domain.service.FormService;
import com.ochoomega.backendapi.rest.resources.mappers.OchoOmegaMapper;
import com.ochoomega.backendapi.rest.resources.v1.FormRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/ochoomega")
public class BaseController {

    @Autowired
    private FormService formService;

    @Autowired
    private OchoOmegaMapper ochoOmegaMapper;

    @PostMapping(path = "/form", consumes = {"application/json"})
    public Long formInput(@RequestBody FormRequest formRequest){
        //mapper to map json values to correct values per table
        Contact contact = ochoOmegaMapper.formRequestToContact(formRequest);

        //use mapped domain entity object to work with db table
        return formService.registerContact(contact);

    }
}
