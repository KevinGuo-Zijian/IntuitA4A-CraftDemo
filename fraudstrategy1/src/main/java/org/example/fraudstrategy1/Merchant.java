package org.example.fraudstrategy1;

public class Merchant {
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
    private Integer fraud;

    public Merchant(String identifier, Integer identityScore, Integer eaScore, Double uwScore,
                    Integer ownerVerifiedComponents, Integer ownerNegativelyVerifiedComponents, Integer ownerPhone1toNameLinkage,
                    Integer ownerPhone1toFirstNameLinkage, Integer ownerAddresstoPhone1Linkage, Integer ownerEmailtoPhone1Linkage,
                    String ownerPrepaidPhoneAttribute, String ownerBusinessPhoneIndicator, String ownerPhoneInServiceIndicator,
                    String ownerPhoneTypeIndicator, Integer ownerServiceDiscontinuedIndicator, Integer ownerRecentPhoneUsagePast2months,
                    Integer ownerPhoneUsagePast12months, String ownerPhoneCarrier, String ownerParentPhoneCarrier,
                    String ownerTechnologyIndicator, Integer ownerVoIPIndicator, String ownerMVNOIndicator, Integer fraud) {
    	
        this.identifier = identifier;
        this.identityScore = identityScore;
        this.eaScore = eaScore;
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
        this.fraud = fraud;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Integer getIdentityScore() {
        return identityScore;
    }

    public void setIdentityScore(Integer identityScore) {
        this.identityScore = identityScore;
    }

    public Integer getEaScore() {
        return eaScore;
    }

    public void setEaScore(Integer eaScore) {
        this.eaScore = eaScore;
    }

    public Double getUwScore() {
        return uwScore;
    }

    public void setUwScore(Double uwScore) {
        this.uwScore = uwScore;
    }

    public Integer getOwnerVerifiedComponents() {
        return ownerVerifiedComponents;
    }

    public void setOwnerVerifiedComponents(Integer ownerVerifiedComponents) {
        this.ownerVerifiedComponents = ownerVerifiedComponents;
    }

    public Integer getOwnerNegativelyVerifiedComponents() {
        return ownerNegativelyVerifiedComponents;
    }

    public void setOwnerNegativelyVerifiedComponents(Integer ownerNegativelyVerifiedComponents) {
        this.ownerNegativelyVerifiedComponents = ownerNegativelyVerifiedComponents;
    }

    public Integer getOwnerPhone1toNameLinkage() {
        return ownerPhone1toNameLinkage;
    }

    public void setOwnerPhone1toNameLinkage(Integer ownerPhone1toNameLinkage) {
        this.ownerPhone1toNameLinkage = ownerPhone1toNameLinkage;
    }

    public Integer getOwnerPhone1toFirstNameLinkage() {
        return ownerPhone1toFirstNameLinkage;
    }

    public void setOwnerPhone1toFirstNameLinkage(Integer ownerPhone1toFirstNameLinkage) {
        this.ownerPhone1toFirstNameLinkage = ownerPhone1toFirstNameLinkage;
    }

    public Integer getOwnerAddresstoPhone1Linkage() {
        return ownerAddresstoPhone1Linkage;
    }

    public void setOwnerAddresstoPhone1Linkage(Integer ownerAddresstoPhone1Linkage) {
        this.ownerAddresstoPhone1Linkage = ownerAddresstoPhone1Linkage;
    }

    public Integer getOwnerEmailtoPhone1Linkage() {
        return ownerEmailtoPhone1Linkage;
    }

    public void setOwnerEmailtoPhone1Linkage(Integer ownerEmailtoPhone1Linkage) {
        this.ownerEmailtoPhone1Linkage = ownerEmailtoPhone1Linkage;
    }

    public String getOwnerPrepaidPhoneAttribute() {
        return ownerPrepaidPhoneAttribute;
    }

    public void setOwnerPrepaidPhoneAttribute(String ownerPrepaidPhoneAttribute) {
        this.ownerPrepaidPhoneAttribute = ownerPrepaidPhoneAttribute;
    }

    public String getOwnerBusinessPhoneIndicator() {
        return ownerBusinessPhoneIndicator;
    }

    public void setOwnerBusinessPhoneIndicator(String ownerBusinessPhoneIndicator) {
        this.ownerBusinessPhoneIndicator = ownerBusinessPhoneIndicator;
    }

    public String getOwnerPhoneInServiceIndicator() {
        return ownerPhoneInServiceIndicator;
    }

    public void setOwnerPhoneInServiceIndicator(String ownerPhoneInServiceIndicator) {
        this.ownerPhoneInServiceIndicator = ownerPhoneInServiceIndicator;
    }

    public String getOwnerPhoneTypeIndicator() {
        return ownerPhoneTypeIndicator;
    }

    public void setOwnerPhoneTypeIndicator(String ownerPhoneTypeIndicator) {
        this.ownerPhoneTypeIndicator = ownerPhoneTypeIndicator;
    }

    public Integer getOwnerServiceDiscontinuedIndicator() {
        return ownerServiceDiscontinuedIndicator;
    }

    public void setOwnerServiceDiscontinuedIndicator(Integer ownerServiceDiscontinuedIndicator) {
        this.ownerServiceDiscontinuedIndicator = ownerServiceDiscontinuedIndicator;
    }

    public Integer getOwnerRecentPhoneUsagePast2months() {
        return ownerRecentPhoneUsagePast2months;
    }

    public void setOwnerRecentPhoneUsagePast2months(Integer ownerRecentPhoneUsagePast2months) {
        this.ownerRecentPhoneUsagePast2months = ownerRecentPhoneUsagePast2months;
    }

    public Integer getOwnerPhoneUsagePast12months() {
        return ownerPhoneUsagePast12months;
    }

    public void setOwnerPhoneUsagePast12months(Integer ownerPhoneUsagePast12months) {
        this.ownerPhoneUsagePast12months = ownerPhoneUsagePast12months;
    }

    public String getOwnerPhoneCarrier() {
        return ownerPhoneCarrier;
    }

    public void setOwnerPhoneCarrier(String ownerPhoneCarrier) {
        this.ownerPhoneCarrier = ownerPhoneCarrier;
    }

    public String getOwnerParentPhoneCarrier() {
        return ownerParentPhoneCarrier;
    }

    public void setOwnerParentPhoneCarrier(String ownerParentPhoneCarrier) {
        this.ownerParentPhoneCarrier = ownerParentPhoneCarrier;
    }

    public String getOwnerTechnologyIndicator() {
        return ownerTechnologyIndicator;
    }

    public void setOwnerTechnologyIndicator(String ownerTechnologyIndicator) {
        this.ownerTechnologyIndicator = ownerTechnologyIndicator;
    }

    public Integer getOwnerVoIPIndicator() {
        return ownerVoIPIndicator;
    }

    public void setOwnerVoIPIndicator(Integer ownerVoIPIndicator) {
        this.ownerVoIPIndicator = ownerVoIPIndicator;
    }

    public String getOwnerMVNOIndicator() {
        return ownerMVNOIndicator;
    }

    public void setOwnerMVNOIndicator(String ownerMVNOIndicator) {
        this.ownerMVNOIndicator = ownerMVNOIndicator;
    }

    public Integer getFraud() {
        return fraud;
    }

    public void setFraud(Integer fraud) {
        this.fraud = fraud;
    }
}
