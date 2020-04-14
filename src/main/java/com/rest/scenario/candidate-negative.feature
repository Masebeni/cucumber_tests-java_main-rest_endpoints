Feature: Candidate Certification
 
  Scenario: candidate Failed
    Given that the user John is given a task to write Java certification exam
    When John got 59 marks in exam
    Then John failed to get Java certification