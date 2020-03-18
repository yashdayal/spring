package com.gatekeeper.gateservice.GateService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateServiceController {

    @RequestMapping(method = RequestMethod.GET, path="/gate-service")
    public String gateService(){
        return "Hello from Apartment Gate!";
    }
}
