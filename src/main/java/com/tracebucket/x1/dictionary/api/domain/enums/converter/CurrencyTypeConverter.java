package com.tracebucket.x1.dictionary.api.domain.enums.converter;

import com.tracebucket.x1.dictionary.api.domain.CurrencyType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class CurrencyTypeConverter implements AttributeConverter<CurrencyType, String> {
    @Override
    public String convertToDatabaseColumn(CurrencyType currencyType) {
        switch (currencyType) {
            case BASE:
                return "BASE";
            case OPTIONAL:
                return "OPTIONAL";
            default:
                throw new IllegalArgumentException("Unknown value: " + currencyType);
        }
    }

    @Override
    public CurrencyType convertToEntityAttribute(String s) {
        switch (s) {
            case "BASE":
                return CurrencyType.BASE;
            case "OPTIONAL":
                return CurrencyType.OPTIONAL;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
