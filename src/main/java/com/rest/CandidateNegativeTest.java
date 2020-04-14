package com.rest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/rest/scenario/candidate-negative.feature")
public class CandidateNegativeTest {
}
