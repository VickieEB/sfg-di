package com.springframework.openclosedprinciple;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        System.out.println("Health Insurance Surveyor: Validated!");
        return true;
    }
}
