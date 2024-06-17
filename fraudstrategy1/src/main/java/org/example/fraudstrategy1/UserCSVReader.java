package org.example.fraudstrategy1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class UserCSVReader {
    private String identifier;
    private Integer identityScore; 
    private Integer eaScore; 
    private Double uwScore;
    private Integer ownerVerifiedComponents;
    private Integer ownerNegativelyVerifiedComponents;
    private Integer ownerPhone1toNameLinkage;
    private Integer ownerPhone1toFirstNameLinkage;
    private Integer ownerAddresstoPhone1Linkage;
    private Integer ownerEmailtoPhone1Linkage;
    private String ownerPrepaidPhoneAttribute;
    private String ownerBusinessPhoneIndicator;
    private String ownerPhoneInServiceIndicator;
    private String ownerPhoneTypeIndicator;
    private Integer ownerServiceDiscontinuedIndicator;
    private Integer ownerRecentPhoneUsagePast2months;
    private Integer ownerPhoneUsagePast12months;
    private String ownerPhoneCarrier;
    private String ownerParentPhoneCarrier;
    private String ownerTechnologyIndicator;
    private Integer ownerVoIPIndicator;
    private String ownerMVNOIndicator;
    private Integer Fraud;

    public UserCSVReader(String identifier,
    Integer identityScore, 
    Integer eaScore, 
    Double uwScore,
    Integer ownerVerifiedComponents,
    Integer ownerNegativelyVerifiedComponents,
    Integer ownerPhone1toNameLinkage,
    Integer ownerPhone1toFirstNameLinkage,
    Integer ownerAddresstoPhone1Linkage,
    Integer ownerEmailtoPhone1Linkage,
    String ownerPrepaidPhoneAttribute,
    String ownerBusinessPhoneIndicator,
    String ownerPhoneInServiceIndicator,
    String ownerPhoneTypeIndicator,
    Integer ownerServiceDiscontinuedIndicator,
    Integer ownerRecentPhoneUsagePast2months,
    Integer ownerPhoneUsagePast12months,
    String ownerPhoneCarrier,
    String ownerParentPhoneCarrier,
    String ownerTechnologyIndicator,
    Integer ownerVoIPIndicator,
    String ownerMVNOIndicator,
    Integer Fraud
) {
    	// 23 attributes
        this.identifier = identifier;
        this.identityScore = identityScore;
        this.eaScore= eaScore; 
        this.uwScore = uwScore;
        this.ownerVerifiedComponents = ownerVerifiedComponents;
        this.ownerNegativelyVerifiedComponents = ownerNegativelyVerifiedComponents;
        this.ownerPhone1toNameLinkage = ownerPhone1toNameLinkage;
        this.ownerPhone1toFirstNameLinkage = ownerPhone1toFirstNameLinkage;
        this.ownerAddresstoPhone1Linkage = ownerAddresstoPhone1Linkage;
        this.ownerEmailtoPhone1Linkage = ownerEmailtoPhone1Linkage;
        this.ownerPrepaidPhoneAttribute = ownerPrepaidPhoneAttribute;
        this.ownerBusinessPhoneIndicator = ownerBusinessPhoneIndicator;
        this.ownerPhoneInServiceIndicator = ownerPhoneInServiceIndicator;
        this.ownerPhoneTypeIndicator = ownerPhoneTypeIndicator;
        this.ownerServiceDiscontinuedIndicator = ownerServiceDiscontinuedIndicator;
        this.ownerRecentPhoneUsagePast2months = ownerRecentPhoneUsagePast2months;
        this.ownerPhoneUsagePast12months = ownerPhoneUsagePast12months;
        this.ownerPhoneCarrier = ownerPhoneCarrier;
        this.ownerParentPhoneCarrier = ownerParentPhoneCarrier;
        this.ownerTechnologyIndicator = ownerTechnologyIndicator;
        this.ownerVoIPIndicator = ownerVoIPIndicator;
        this.ownerMVNOIndicator = ownerMVNOIndicator;
        this.Fraud = Fraud;
    }
    

	public String getIdentifier() {
        return identifier;
    }

    public Integer getIdentityScore() {
        return identityScore;
    }

    public Integer getEaScore() {
        return eaScore;
    }
    
    public Double getuwScore() {
    	return uwScore;
    }
    
    public Integer getownerVerifiedComponents() {
    	return ownerVerifiedComponents;
    }
    
    public Integer getownerNegativelyVerifiedComponents() {
    	return ownerNegativelyVerifiedComponents;
    }
    
    public Integer getownerPhone1toNameLinkage() {
    	return ownerPhone1toNameLinkage;
    }
    
    public Integer getownerPhone1toFirstNameLinkage () {
    	return ownerPhone1toFirstNameLinkage;
    }
    
    public Integer getownerAddresstoPhone1Linkage() {
    	return ownerAddresstoPhone1Linkage;
    }
    
    public Integer getownerEmailtoPhone1Linkage() {
    	return ownerEmailtoPhone1Linkage;
    }
    
    public String getownerPrepaidPhoneAttribute() {
    	return ownerPrepaidPhoneAttribute;
    }
    
    public String getownerBusinessPhoneIndicator() {
    	return ownerBusinessPhoneIndicator;
    }
    
    public String getownerPhoneInServiceIndicator() {
    	return ownerPhoneInServiceIndicator;
    }
    
    public String getownerPhoneTypeIndicator() {
    	return ownerPhoneTypeIndicator;
    }
    
    public Integer getownerServiceDiscontinuedIndicator() {
    	return ownerServiceDiscontinuedIndicator;
    }
    
    public Integer getownerRecentPhoneUsagePast2months() {
    	return ownerRecentPhoneUsagePast2months;
    }
    
    public Integer getownerPhoneUsagePast12months() {
    	return ownerPhoneUsagePast12months;
    }
    
    public String getownerPhoneCarrier() {
    	return ownerPhoneCarrier;
    }
    
    public String getownerParentPhoneCarrier() {
    	return ownerParentPhoneCarrier;
    }
    
    public String getownerTechnologyIndicator() {
    	return ownerTechnologyIndicator;
    }
    
    public Integer getownerVoIPIndicator() {
    	return ownerVoIPIndicator;
    }
    
    public String getownerMVNOIndicator() {
    	return ownerMVNOIndicator;
    }
    
    public Integer getFraud() {
    	return Fraud;
    }
    
    
    public static List<UserCSVReader> readFromCSV(String filePath) {
        List<UserCSVReader> users = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            boolean isFirstLine = true;
            while ((line = reader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the first line
                }
                String identifier = line[0];
                Integer identityScore = parseInteger(line[1],0,999); // Parse and handle possible null
                Integer eaScore = parseInteger(line[2],0,999); // Parse and handle possible null
                Double uwScore = parseDouble(line[3],0.0,99.9);
                Integer ownerVerifiedComponents = parseInteger(line[4]);
                Integer ownerNegativelyVerifiedComponents = parseInteger(line[5]);
                Integer ownerPhone1toNameLinkage = parseInteger(line[6]);
                Integer ownerPhone1toFirstNameLinkage =parseInteger(line[7]);
                Integer ownerAddresstoPhone1Linkage = parseInteger(line[8]);
                Integer ownerEmailtoPhone1Linkage = parseInteger(line[9]);
                String ownerPrepaidPhoneAttribute = parseString(line[10]);
                String ownerBusinessPhoneIndicator = parseString(line[11]);
                String ownerPhoneInServiceIndicator = parseString(line[12],"^[AIU][1-7]$"); // only parse specific pattern for categorical attributes
                String ownerPhoneTypeIndicator = parseString(line[13]);
                Integer ownerServiceDiscontinuedIndicator = parseInteger(line[14]);
                Integer ownerRecentPhoneUsagePast2months = parseInteger(line[15]);
                Integer ownerPhoneUsagePast12months = parseInteger(line[16]);
                String ownerPhoneCarrier = parseString(line[17]);
                String ownerParentPhoneCarrier = parseString(line[18]);
                String ownerTechnologyIndicator = parseString(line[19]);
                Integer ownerVoIPIndicator = parseInteger(line[20]);
                String ownerMVNOIndicator = parseString(line[21]);
                Integer Fraud = parseInteger(line[22]);
                      
                
                users.add(new UserCSVReader(identifier, 
                		identityScore, 
                		eaScore, 
                	    uwScore,
                	    ownerVerifiedComponents,
                	    ownerNegativelyVerifiedComponents,
                	    ownerPhone1toNameLinkage,
                	    ownerPhone1toFirstNameLinkage,
                	    ownerAddresstoPhone1Linkage,
                	    ownerEmailtoPhone1Linkage,
                	    ownerPrepaidPhoneAttribute,
                	    ownerBusinessPhoneIndicator,
                	    ownerPhoneInServiceIndicator,
                	    ownerPhoneTypeIndicator,
                	    ownerServiceDiscontinuedIndicator,
                	    ownerRecentPhoneUsagePast2months,
                	    ownerPhoneUsagePast12months,
                	    ownerPhoneCarrier,
                	    ownerParentPhoneCarrier,
                	    ownerTechnologyIndicator,
                	    ownerVoIPIndicator,
                	    ownerMVNOIndicator,
                	    Fraud));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return users;
    }

 // Method to parse integer values and handle exceptions and range validation
    private static Integer parseInteger(String value, Integer minValue, Integer maxValue) {
        try {
            Integer parsedValue = Integer.parseInt(value);
            if (parsedValue >= minValue && parsedValue <= maxValue) {
                return parsedValue;
            } else {
                return null; // Return null if the value is out of range
            }
        } catch (NumberFormatException e) {
            return null; // Return null if parsing fails
        }
    }

    // Overloaded method to handle cases without range validation
    private static Integer parseInteger(String value) {
        return parseInteger(value, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    
    // Method to parse double values and handle exceptions and range validation
    private static Double parseDouble(String value, Double minValue, Double maxValue) {
        try {
            Double parsedValue = Double.parseDouble(value);
            if (parsedValue >= minValue && parsedValue <= maxValue) {
                return parsedValue;
            } else {
                return null; // Return null if the value is out of range
            }
        } catch (NumberFormatException e) {
            return null; // Return null if parsing fails
        }
    }

    // Overloaded method to handle cases without range validation
    private static Double parseDouble(String value) {
        return parseDouble(value, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    
    
    // Method to parse string values and handle empty strings and optional regex validation
    private static String parseString(String value, String regex) {
        if (value == null || value.trim().isEmpty()) {
            return null; // Return null if the string is empty
        }
        
        if (regex != null && !regex.trim().isEmpty()) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(value);
            
            if (!matcher.matches()) {
                return null; // Return null if it doesn't match the regex
            }
        }
        
        return value; // Return the value if it is not empty and matches the regex (if provided)
    }

    // Overloaded method to handle cases without regex
    private static String parseString(String value) {
        return parseString(value, null);
    }

}
