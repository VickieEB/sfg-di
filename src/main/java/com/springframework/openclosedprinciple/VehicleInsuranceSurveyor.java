package com.springframework.openclosedprinciple;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("Vehicle Insurance Surveyor: Validated!");
        return true;
    }
}
