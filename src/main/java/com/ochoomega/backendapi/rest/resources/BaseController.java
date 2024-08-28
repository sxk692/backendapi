package com.ochoomega.backendapi.rest.resources;


import com.ochoomega.backendapi.rest.resources.v1.FormRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/ochoomega")
public class BaseController {

    @PostMapping(path = "/form")
    public void formInput(FormRequest formRequest){
        //mapper

    }
}
