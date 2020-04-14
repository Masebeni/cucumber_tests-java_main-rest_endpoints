package com.rest.common;

import com.rest.Candidate;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertThat;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;

public class CandidateSteps {

	private Candidate candidate = new Candidate();

	@Given("^that the user (.*) is given a task to write (.*) certification exam$")
	public void certificationName(String name, String certication) {
		candidate.setCandidateName(name);
		candidate.setCertificateName(certication);
	}

	@When("^(.*) got (\\d+) marks in exam$")
	public void gotMarks(String name, int marks) {
		candidate.setCandidateName(name);
		candidate.setMarks(marks);
	}

	@Then("^(.*) is known as (.*) certified$")
	public void certifiedYes(String name, String certification) {
		MatcherAssert.assertThat(name, CoreMatchers.is(candidate.getCandidateName()));
		MatcherAssert.assertThat(candidate.getCertificateName(), IsEqual.equalTo(certification));
		MatcherAssert.assertThat(candidate.getCertified(), CoreMatchers.is(true));
	}

	@Then("^(.*) failed to get (.*) certification$")
	public void certifiedNo(String name, String certification) {
		MatcherAssert.assertThat(name, CoreMatchers.is(candidate.getCandidateName()));
		MatcherAssert.assertThat(candidate.getCertificateName(), IsEqual.equalTo(certification));
		MatcherAssert.assertThat(candidate.getCertified(), CoreMatchers.is(false));
	}


	@Then("^(.*) is known as (.*) certified.$")
	public boolean testEndpoint(boolean reuslts) {
		return reuslts;
	}

}
