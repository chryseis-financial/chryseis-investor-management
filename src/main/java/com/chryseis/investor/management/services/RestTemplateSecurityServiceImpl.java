package com.chryseis.investor.management.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: RestTemplateSecurityServiceImpl
 * Inside the package - com.chryseis.investor.management.services
 * Created Date: 5/20/2020
 * Created Time: 2:39 PM
 **/
@Slf4j
@Component
public class RestTemplateSecurityServiceImpl implements ISecurityService{

    private final String SECURITIES_PATH = "/securities/{tickerSymbol}";

    private RestTemplate restTemplate;

    private String securitiesServiceHost = "http://localhost:8081";

    public RestTemplateSecurityServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

//    public void setSecuritiesServiceServiceHost(String securitiesServiceHost){
//        this.securitiesServiceHost = securitiesServiceHost;
//    }

    @Override
    public String getSecurityDetail(String tickerSymbol) {
        log.info("Calling Securities service");
        ResponseEntity<String> responseEntity = restTemplate
                .exchange(securitiesServiceHost + SECURITIES_PATH, HttpMethod.GET, null,
                        new ParameterizedTypeReference<String>() {}, (Object) tickerSymbol);
        String security = responseEntity.getBody();
        return security;
    }
}
