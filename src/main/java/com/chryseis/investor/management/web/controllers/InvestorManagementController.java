package com.chryseis.investor.management.web.controllers;

import com.chryseis.investor.management.web.api.InvestorManagementApi;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: InvestorController
 * Inside the package - com.chryseis.investor.management.web.controllers
 * Created Date: 5/7/2020
 * Created Time: 2:36 PM
 **/
@RestController
public class InvestorManagementController implements InvestorManagementApi {


    @Override
    public ResponseEntity<String> getInvestorById(String investorId) {
        return new ResponseEntity("Hello", HttpStatus.OK);
    }
}
