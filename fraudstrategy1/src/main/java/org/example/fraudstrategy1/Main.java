package org.example.fraudstrategy1;

import java.util.List;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/org/example/fraudstrategy1/UserDataReal.csv";

        // Read the user data from CSV file
        List<UserCSVReader> userCSVReaders = UserCSVReader.readFromCSV(filePath);
        
        if (userCSVReaders != null && !userCSVReaders.isEmpty()) {
            // Get the KieSession from KieServ
            KieSession kieSession = new KieServ().getKieSession();
            
            // Create an Onboard object
            Onboard onboard = new Onboard(kieSession);
            
            // Iterate through each UserCSVReader and onboard the merchant
            for (UserCSVReader userCSVReader : userCSVReaders) {
                // Convert UserCSVReader to Merchant object
                Merchant merchant = userCSVReader.toMerchant();
                
                // Create a new Decision object
                Decision decisionResult = new Decision();
                
                // Onboard the merchant
                onboard.onboardMerchant(merchant, decisionResult);
            }
            
            // Dispose the KieSession
            kieSession.dispose();
        }
    }
}
