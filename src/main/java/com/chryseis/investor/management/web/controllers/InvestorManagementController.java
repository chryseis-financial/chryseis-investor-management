package com.chryseis.investor.management.web.controllers;

import com.chryseis.investor.management.services.ISecurityService;
import com.chryseis.investor.management.web.api.InvestorManagementApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    private ISecurityService securityService;

    public InvestorManagementController(ISecurityService securityService) {
        this.securityService = securityService;
    }

    @Override
    public ResponseEntity<String> getInvestorById(String investorId) {
        String security = securityService.getSecurityDetail(investorId);
        return new ResponseEntity(security, HttpStatus.OK);
    }
}
