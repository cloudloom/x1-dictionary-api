package com.tracebucket.x1.dictionary.api.domain;

/**
 * @author ffl
 * @since 11-04-2014
 */
public enum AddressType {
    HEAD_OFFICE("Head Office","HEAD_OFFICE"),
    BRANCH("Branch", "BRANCH");

    private final String addressType;
    private final String abbreviation;

    AddressType(String addressType, String abbreviation){
        this.addressType = addressType;
        this.abbreviation = abbreviation;
    }

    public String getAddressType(){
        return addressType;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
