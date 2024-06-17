package org.example.fraudstrategy1;

import java.util.List;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/org/example/fraudstrategy1/UserDataReal.csv";

        List<UserCSVReader> userCSVReaders = UserCSVReader.readFromCSV(filePath);
        
        if (userCSVReaders != null && !userCSVReaders.isEmpty()) {
            KieSession kieSession = new KieServ().getKieSession();
            
            Onboard onboard = new Onboard(kieSession);
            
            for (UserCSVReader userCSVReader : userCSVReaders) {

                String identifier = userCSVReader.getIdentifier();
                Integer identityScore = userCSVReader.getIdentityScore();
                Integer eaScore = userCSVReader.getEaScore();
                Double uwScore = userCSVReader.getuwScore(); 
                Integer ownerVerifiedComponents = userCSVReader.getownerVerifiedComponents();
                Integer ownerNegativelyVerifiedComponents = userCSVReader.getownerNegativelyVerifiedComponents();
                Integer ownerPhone1toNameLinkage = userCSVReader.getownerPhone1toNameLinkage();
                Integer ownerPhone1toFirstNameLinkage = userCSVReader.getownerPhone1toFirstNameLinkage();
                Integer ownerAddresstoPhone1Linkage = userCSVReader.getownerAddresstoPhone1Linkage();
                Integer ownerEmailtoPhone1Linkage = userCSVReader.getownerEmailtoPhone1Linkage();
                String ownerPrepaidPhoneAttribute = userCSVReader.getownerPrepaidPhoneAttribute();
                String ownerBusinessPhoneIndicator = userCSVReader.getownerBusinessPhoneIndicator();
                String ownerPhoneInServiceIndicator = userCSVReader.getownerPhoneInServiceIndicator();
                String ownerPhoneTypeIndicator = userCSVReader.getownerPhoneTypeIndicator();
                Integer ownerServiceDiscontinuedIndicator = userCSVReader.getownerServiceDiscontinuedIndicator();
                Integer ownerRecentPhoneUsagePast2months = userCSVReader.getownerRecentPhoneUsagePast2months();
                Integer ownerPhoneUsagePast12months = userCSVReader.getownerPhoneUsagePast12months();
                String ownerPhoneCarrier = userCSVReader.getownerPhoneCarrier();
                String ownerParentPhoneCarrier = userCSVReader.getownerParentPhoneCarrier();
                String ownerTechnologyIndicator = userCSVReader.getownerTechnologyIndicator();
                Integer ownerVoIPIndicator = userCSVReader.getownerVoIPIndicator();
                String ownerMVNOIndicator = userCSVReader.getownerMVNOIndicator();
                Integer fraud = userCSVReader.getFraud();
                
                Merchant merchant = new Merchant(
                    identifier, identityScore, eaScore, uwScore, ownerVerifiedComponents, ownerNegativelyVerifiedComponents,
                    ownerPhone1toNameLinkage, ownerPhone1toFirstNameLinkage, ownerAddresstoPhone1Linkage, ownerEmailtoPhone1Linkage,
                    ownerPrepaidPhoneAttribute, ownerBusinessPhoneIndicator, ownerPhoneInServiceIndicator, ownerPhoneTypeIndicator,
                    ownerServiceDiscontinuedIndicator, ownerRecentPhoneUsagePast2months, ownerPhoneUsagePast12months, ownerPhoneCarrier,
                    ownerParentPhoneCarrier, ownerTechnologyIndicator, ownerVoIPIndicator, ownerMVNOIndicator, fraud
                );
                
                Decision decisionResult = new Decision();
                onboard.onboardMerchant(merchant, decisionResult);
            }
            
            kieSession.dispose();
        }
    }
}
