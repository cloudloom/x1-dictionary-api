package com.tracebucket.x1.dictionary.api.domain;

/**
 * @author ffl
 * @since 11-04-2014
 */
public enum PhoneType {
    MOBILE("Mobile","MOBILE"),
    WORK("Work","WORK"),
    HOME("Home","HOME"),
    FAX("FAX","FAX");

    private final String phoneType;
    private final String abbreviation;

    PhoneType(String phoneType, String abbreviation){
        this.phoneType = phoneType;
        this.abbreviation = abbreviation;
    }

    public String getPhoneType(){
        return phoneType;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
