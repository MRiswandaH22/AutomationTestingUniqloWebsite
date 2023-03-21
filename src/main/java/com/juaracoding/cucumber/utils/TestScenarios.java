package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("User Succesful register akun"),
    T2("User Succesful login");

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
