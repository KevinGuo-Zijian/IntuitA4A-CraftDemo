package org.example.fraudstrategy1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserCSVReaderTest {
    private String csvFilePath;

    @BeforeEach
    void setUp() {
        // Assuming the CSV file is in the same directory as the test class or specify the absolute path
        csvFilePath = "src/main/resources/org/example/fraudstrategy1/TestUserData.csv"; // Update this path accordingly
    }

    @Test
    void testReadFromCSV() {
        List<UserCSVReader> userList = UserCSVReader.readFromCSV(csvFilePath);
        assertNotNull(userList, "The user list should not be null");

        // Print the parsed user list
        for (UserCSVReader user : userList) {
            System.out.println("Identifier: " + user.getIdentifier());
            System.out.println("Identity Score: " + user.getIdentityScore());
            System.out.println("EA Score: " + user.getEaScore());
            System.out.println("UW Score: " + user.getuwScore());
            System.out.println("Owner Verified Components: " + user.getownerVerifiedComponents());
            System.out.println("Owner Negatively Verified Components: " + user.getownerNegativelyVerifiedComponents());
            System.out.println("Owner Phone1 to Name Linkage: " + user.getownerPhone1toNameLinkage());
            System.out.println("Owner Phone1 to First Name Linkage: " + user.getownerPhone1toFirstNameLinkage());
            System.out.println("Owner Address to Phone1 Linkage: " + user.getownerAddresstoPhone1Linkage());
            System.out.println("Owner Email to Phone1 Linkage: " + user.getownerEmailtoPhone1Linkage());
            System.out.println("Owner Prepaid Phone Attribute: " + user.getownerPrepaidPhoneAttribute());
            System.out.println("Owner Business Phone Indicator: " + user.getownerBusinessPhoneIndicator());
            System.out.println("Owner Phone In Service Indicator: " + user.getownerPhoneInServiceIndicator());
            System.out.println("Owner Phone Type Indicator: " + user.getownerPhoneTypeIndicator());
            System.out.println("Owner Service Discontinued Indicator: " + user.getownerServiceDiscontinuedIndicator());
            System.out.println("Owner Recent Phone Usage Past 2 months: " + user.getownerRecentPhoneUsagePast2months());
            System.out.println("Owner Phone Usage Past 12 months: " + user.getownerPhoneUsagePast12months());
            System.out.println("Owner Phone Carrier: " + user.getownerPhoneCarrier());
            System.out.println("Owner Parent Phone Carrier: " + user.getownerParentPhoneCarrier());
            System.out.println("Owner Technology Indicator: " + user.getownerTechnologyIndicator());
            System.out.println("Owner VoIP Indicator: " + user.getownerVoIPIndicator());
            System.out.println("Owner MVNO Indicator: " + user.getownerMVNOIndicator());
            System.out.println("--------------------------------");
        }
    }
}
