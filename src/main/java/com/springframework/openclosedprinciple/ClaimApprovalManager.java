package com.springframework.openclosedprinciple;

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("Claim Approved!!");
        }

    }
}
