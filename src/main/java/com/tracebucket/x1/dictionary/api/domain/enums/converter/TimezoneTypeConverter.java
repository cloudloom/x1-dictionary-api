package com.tracebucket.x1.dictionary.api.domain.enums.converter;

import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.dictionary.api.domain.TimezoneType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class TimezoneTypeConverter implements AttributeConverter<TimezoneType, String> {
    @Override
    public String convertToDatabaseColumn(TimezoneType timezoneType) {
        switch (timezoneType) {
            case DEFAULT:
                return "DEFAULT";
            case OPTIONAL:
                return "OPTIONAL";
            case OPTION_1:
                return "OPTION_1";
            case OPTION_2:
                return "OPTION_2";
            default:
                throw new IllegalArgumentException("Unknown value: " + timezoneType);
        }     }

    @Override
    public TimezoneType convertToEntityAttribute(String s) {
        switch (s) {
            case "DEFAULT":
                return TimezoneType.DEFAULT;
            case "OPTIONAL":
                return TimezoneType.OPTIONAL;
            case "OPTION_1":
                return TimezoneType.OPTION_1;
            case "OPTION_2":
                return TimezoneType.OPTION_2;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
