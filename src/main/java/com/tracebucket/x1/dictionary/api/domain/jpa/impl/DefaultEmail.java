package com.tracebucket.x1.dictionary.api.domain.jpa.impl;

import com.tracebucket.tron.ddd.domain.BaseValueObject;
import com.tracebucket.x1.dictionary.api.domain.Email;
import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.dictionary.api.domain.enums.converter.EmailTypeConverter;

import javax.persistence.*;

@Embeddable
public class DefaultEmail extends BaseValueObject implements Email{

    @Column(name = "EMAIL")
    @Basic(fetch = FetchType.EAGER)
    private String email;

    @Column(name = "EMAIL_TYPE")
    @Convert(converter = EmailTypeConverter.class)
    private EmailType emailType;

    @Column(name = "DEFAULT_EMAIL", nullable = false, columnDefinition = "boolean default true")
    @Basic(fetch = FetchType.EAGER)
    private boolean defaultEmail;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailType getEmailType() {
        return emailType;
    }

    public void setEmailType(EmailType emailType) {
        this.emailType = emailType;
    }

    public boolean isDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(boolean defaultEmail) {
        this.defaultEmail = defaultEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultEmail)) return false;

        DefaultEmail email1 = (DefaultEmail) o;

        if (!email.equals(email1.email)) return false;
        if (emailType != email1.emailType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + (emailType != null ? emailType.hashCode() : 0);
        return result;
    }
}
