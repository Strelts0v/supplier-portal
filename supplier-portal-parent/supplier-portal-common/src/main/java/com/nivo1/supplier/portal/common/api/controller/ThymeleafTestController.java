package com.nivo1.supplier.portal.common.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThymeleafTestController {

    // inject via application.properties
    @Value("${test.value:0}")
    private int value;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("value", this.value);
        return "welcome";
    }
}
