package com.chryseis.investor.management.web.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: InvestorManagementApi
 * Inside the package - com.chryseis.investor.management.web.api
 * Created Date: 5/7/2020
 * Created Time: 2:37 PM
 **/
@Tag(name = "investor-management", description = "The chryseis investor management API")
public interface InvestorManagementApi {

    @Operation(
            summary = "Find Investor By id",
            description = "Find the investor for the given investor Id",
//            tags = {
//                    "product"
//            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful Operation",
                            content = {
                                    @Content(
                                            schema = @Schema(implementation = String.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping(value = "/investors/{investorId}",produces = {"application/json"})
    ResponseEntity<String> getInvestorById(@PathVariable("investorId") String investorId);
}
