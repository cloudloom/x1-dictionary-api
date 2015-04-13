package com.tracebucket.x1.dictionary.api.domain;

/**
 * @author ffl
 * @since 11-04-2014
 */
public enum Gender {
    MALE("Male","MALE"),
    FEMALE("Female","FEMALE");

    private final String gender;
    private final String abbreviation;

    Gender(String gender, String abbreviation){
        this.gender = gender;
        this.abbreviation = abbreviation;
    }

    public String getGender(){
        return gender;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
