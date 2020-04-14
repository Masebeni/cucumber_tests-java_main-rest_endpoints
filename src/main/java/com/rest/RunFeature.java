package com.rest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.stereotype.Repository;

@Repository
public class RunFeature {

    public Result testCandidatePositive() {
        return JUnitCore.runClasses(CandidatePositiveTest.class);
    }

    public Result testCandidateNegative() {
        return JUnitCore.runClasses(CandidateNegativeTest.class);
    }

    public Result testCandidateFeatureNegativeAndPositive() {
       return JUnitCore.runClasses(CandidateNegativeTest.class, CandidatePositiveTest.class);
    }
}
