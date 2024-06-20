package org.example.fraudstrategy1;

import java.util.List;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
    	// Define Path to CSV file containing user data
        String filePath = "src/main/resources/org/example/fraudstrategy1/UserDataReal.csv";

        // Read the user data from CSV file
        List<UserCSVReader> userCSVReaders = UserCSVReader.readFromCSV(filePath);
        
        // check if the list of users is null
        if (userCSVReaders != null && !userCSVReaders.isEmpty()) {
        	
            // Get the KieSession from KieServ Class
            KieSession kieSession = new KieServ().getKieSession();
            
            // Create a new Onboard instance with the KieSession
            Onboard onboard = new Onboard(kieSession);
            
            // Iterate through each UserCSVReader
            for (UserCSVReader userCSVReader : userCSVReaders) {
            	
                // Convert UserCSVReader to Merchant object
                Merchant merchant = userCSVReader.toMerchant();
                
                // Create a new Decision object
                Decision decisionResult = new Decision();
                
                // Onboard the merchant to obtain Decision 
                onboard.onboardMerchant(merchant);
            }
            
            // Dispose the KieSession
            kieSession.dispose();
        }
    }
}
