package com.tracebucket.x1.dictionary.api.domain;

/**
 * @author ffl
 * @since 11-04-2014
 */
public enum PersonType {
    TECHNICAL("Technical","TECHNICAL"),
    ADMINISTRATIVE("Administrative","ADMINISTRATIVE");

    private final String personType;
    private final String abbreviation;

    PersonType(String personType, String abbreviation){
        this.personType = personType;
        this.abbreviation = abbreviation;
    }

    public String getPersonType(){
        return personType;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
