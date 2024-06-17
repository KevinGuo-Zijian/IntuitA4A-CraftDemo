//ORIGIN
package org.example.fraudstrategy1;

import org.kie.api.runtime.KieSession;

public class Onboard {
    private KieSession kieSession;

    public Onboard(KieSession kieSession) {
        this.kieSession = kieSession;
    }

    public Decision onboardMerchant(Merchant merchant, Decision decision) {
        kieSession.insert(merchant);
        kieSession.setGlobal("decision", decision);
        kieSession.fireAllRules();
        System.out.println("Merchant "+ merchant.getIdentifier() + 
        		" the Fraud Engine Decision is " + decision.getDecision() + " by " + decision.getRuleName() + "\n");
        return decision;
    }
}
