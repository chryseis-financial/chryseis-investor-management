package com.chryseis.investor.management.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: HomeController
 * Inside the package - com.chryseis.investor.management.config
 * Created Date: 5/7/2020
 * Created Time: 2:17 PM
 **/
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
