package com.tracebucket.x1.dictionary.api.domain.enums.converter;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.dictionary.api.domain.Gender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class GenderTypeConverter implements AttributeConverter<Gender, String> {
    @Override
    public String convertToDatabaseColumn(Gender gender) {
        switch (gender) {
            case MALE:
                return "MALE";
            case FEMALE:
                return "FEMALE";
            default:
                throw new IllegalArgumentException("Unknown value: " + gender);
        }
    }

    @Override
    public Gender convertToEntityAttribute(String s) {
        switch (s) {
            case "MALE":
                return Gender.MALE;
            case "FEMALE":
                return Gender.FEMALE;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
