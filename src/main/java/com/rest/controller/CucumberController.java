package com.rest.controller;

import com.rest.RunFeature;
import com.rest.config.Properties;
import com.rest.config.SwaggerIncluded;
import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/features/")
public class CucumberController {
    @Autowired
    private RunFeature runFeature;

    @Autowired
    private Properties properties;

    @SwaggerIncluded
    @GetMapping(path ="/test/candidate/positive", produces = "application/json")
    public Result testCandidateFeaturePositive() {
        System.out.println("\n\n====== " + properties.getCountries().getPath() +
                " : " + properties.getCountries().getCountry() + " ===== "+
                " : " + properties.getCountries().getCountryCode() + " =====\n\n");
        return runFeature.testCandidatePositive();
    }

    @SwaggerIncluded
    @GetMapping(path ="/test/candidate/negative", produces = "application/json")
    public Result testCandidateFeatureNegative() { return runFeature.testCandidateNegative(); }

    @SwaggerIncluded
    @GetMapping(path ="/test/candidate/tests", produces = "application/json")
    public Result testCandidateFeatureNegativeAndPositive() { return runFeature.testCandidateFeatureNegativeAndPositive();
    }


}
