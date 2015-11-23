package com.tracebucket.x1.dictionary.api.domain.enums.converter;

import com.tracebucket.x1.dictionary.api.domain.PersonType;
import com.tracebucket.x1.dictionary.api.domain.PhoneType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class PhoneTypeConverter implements AttributeConverter<PhoneType, String> {
    @Override
    public String convertToDatabaseColumn(PhoneType phoneType) {
        switch (phoneType) {
            case MOBILE:
                return "MOBILE";
            case WORK:
                return "WORK";
            case HOME:
                return "HOME";
            case FAX:
                return "FAX";
            default:
                throw new IllegalArgumentException("Unknown value: " + phoneType);
        }
    }

    @Override
    public PhoneType convertToEntityAttribute(String s) {
        switch (s) {
            case "MOBILE":
                return PhoneType.MOBILE;
            case "WORK":
                return PhoneType.WORK;
            case "HOME":
                return PhoneType.HOME;
            case "FAX":
                return PhoneType.FAX;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
