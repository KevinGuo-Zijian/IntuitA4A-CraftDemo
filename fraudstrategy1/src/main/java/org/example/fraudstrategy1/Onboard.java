package org.example.fraudstrategy1;

import org.kie.api.runtime.KieSession;

public class Onboard {
    // initialize the KIEsession and insert the merchant fact data
    private KieSession kieSession;

    // get KIE Session to execute rules
    public Onboard(KieSession kieSession) {
        this.kieSession = kieSession;
    }

    // create method to get decision of a merchant 
    public void onboardMerchant(Merchant merchant) {
        // insert fact data to KIE Session
        kieSession.insert(merchant);

        // fire rules
        kieSession.fireAllRules();

        // print out the decision after decision was returned
        System.out.println("Merchant " + merchant.getIdentifier() + 
                " the Fraud Engine Decision is " + merchant.getDecision() + " by " + merchant.getRuleNames() + "\n");
    }
}
