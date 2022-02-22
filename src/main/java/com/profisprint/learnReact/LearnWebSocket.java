package com.profisprint.learnReact;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class LearnWebSocket {

    @RequestMapping(value = "/profitcentr", method = RequestMethod.GET)
    public String profitcentr() {
        return "OK";
    }
}
