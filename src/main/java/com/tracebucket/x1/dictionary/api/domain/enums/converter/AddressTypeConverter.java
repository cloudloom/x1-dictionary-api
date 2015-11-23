package com.tracebucket.x1.dictionary.api.domain.enums.converter;

import com.tracebucket.x1.dictionary.api.domain.AddressType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class AddressTypeConverter implements AttributeConverter<AddressType, String> {
    @Override
    public String convertToDatabaseColumn(AddressType addressType) {
        switch (addressType) {
            case HEAD_OFFICE:
                return "HEAD_OFFICE";
            case BRANCH:
                return "BRANCH";
            default:
                throw new IllegalArgumentException("Unknown value: " + addressType);
        }
    }

    @Override
    public AddressType convertToEntityAttribute(String s) {
        switch (s) {
            case "HEAD_OFFICE":
                return AddressType.HEAD_OFFICE;
            case "BRANCH":
                return AddressType.BRANCH;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
