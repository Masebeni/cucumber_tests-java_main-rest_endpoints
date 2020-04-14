package com.rest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Setter
@Getter
@Repository
public class Candidate {

	private Integer id;
	private String CandidateName;
	private String course;
	private String certificateName;
	private String examNumber;
	private int marks;
	private boolean results;

	public boolean getCertified() {
		return results = marks >= 60 ? true : false;
	}

}
