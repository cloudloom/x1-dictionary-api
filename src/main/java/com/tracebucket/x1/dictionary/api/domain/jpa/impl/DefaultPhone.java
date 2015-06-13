package com.tracebucket.x1.dictionary.api.domain.jpa.impl;

import com.tracebucket.tron.ddd.domain.BaseValueObject;
import com.tracebucket.x1.dictionary.api.domain.Phone;
import com.tracebucket.x1.dictionary.api.domain.PhoneType;

import javax.persistence.*;

@Embeddable
public class DefaultPhone extends BaseValueObject implements Phone{

    @Column(name = "NUMBER")
    @Basic(fetch = FetchType.EAGER)
    private String number;

    @Column(name = "EXTENSION")
    @Basic(fetch = FetchType.EAGER)
    private String extension;

    @Column(name = "PHONE_TYPE", nullable = false, columnDefinition = "ENUM('MOBILE', 'WORK', 'HOME') default 'WORK'")
    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;

    @Column(name = "DEFAULT_PHONE", nullable = false, columnDefinition = "boolean default true")
    @Basic(fetch = FetchType.EAGER)
    private boolean defaultPhone;

    public DefaultPhone(){

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public boolean isDefaultPhone() {
        return defaultPhone;
    }

    public void setDefaultPhone(boolean defaultPhone) {
        this.defaultPhone = defaultPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultPhone)) return false;

        DefaultPhone phone = (DefaultPhone) o;

        if (extension != null ? !extension.equals(phone.extension) : phone.extension != null) return false;
        if (!number.equals(phone.number)) return false;
        if (phoneType != phone.phoneType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (phoneType != null ? phoneType.hashCode() : 0);
        return result;
    }
}
