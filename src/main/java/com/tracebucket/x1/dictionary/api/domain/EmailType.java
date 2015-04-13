package com.tracebucket.x1.dictionary.api.domain;

/**
 * @author ffl
 * @since 11-04-2014
 */
public enum EmailType {
    PERSONAL("Personal","PERSONAL"),
    BUSINESS("Business","BUSINESS");

    private final String emailType;
    private final String abbreviation;

    EmailType(String emailType, String abbreviation){
        this.emailType = emailType;
        this.abbreviation = abbreviation;
    }

    public String getEmailType(){
        return emailType;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
