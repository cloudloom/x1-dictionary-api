package com.tracebucket.x1.dictionary.api.domain.jpa.impl;

import com.tracebucket.tron.ddd.domain.BaseEntity;
import com.tracebucket.x1.dictionary.api.domain.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "PERSON")
public class DefaultPerson extends BaseEntity implements Person {

    @Column(name = "FIRST_NAME", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String lastName;

    @Column(name = "BIRTHDAY")
    @Basic(fetch = FetchType.EAGER)
    private Date birthDay;

    @Column(name = "GENDER", nullable = false,columnDefinition = "ENUM('MALE', 'FEMALE') default 'MALE'")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "IMAGE")
    @Basic(fetch = FetchType.EAGER)
    private String image;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERSON_EMAIL",
            joinColumns = @JoinColumn(name = "PERSON__ID"))
    @MapKeyColumn(name = "EMAIL_ID", nullable = false)
    @Column(name = "EMAIL_TYPE", nullable = false, columnDefinition = "ENUM('PERSONAL','BUSINESS') default 'BUSINESS'")
    @Enumerated(EnumType.STRING)
    private Map<String, EmailType> emails = new HashMap<String, EmailType>(0);

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERSON_PHONE",
            joinColumns = @JoinColumn(name = "PERSON__ID"))
    @MapKeyColumn(name = "PHONE_NUMBER", nullable = false)
    @Column(name = "PHONE_TYPE", nullable = false, columnDefinition = "ENUM('MOBILE','WORK','HOME') default 'MOBILE'")
    @Enumerated(EnumType.STRING)
    private Map<String, PhoneType> phones = new HashMap<String, PhoneType>(0);


    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "PERSON_TYPE", joinColumns = @JoinColumn(name = "PERSON__ID"))
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false, columnDefinition = "ENUM('TECHNICAL','ADMINISTRATIVE') default 'ADMINISTRATIVE'")
    private Set<PersonType> personTypes = new HashSet<PersonType>();

    @Column(name = "DEFAULT_CONTACT_PERSON", nullable = false, columnDefinition = "boolean default true")
    @Basic(fetch = FetchType.EAGER)
    private boolean defaultContactPerson;

    public DefaultPerson(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map<String, EmailType> getEmails() {
        return emails;
    }

    public void setEmails(Map<String, EmailType> emails) {
        this.emails = emails;
    }

    public Map<String, PhoneType> getPhones() {
        return phones;
    }

    public void setPhones(Map<String, PhoneType> phones) {
        this.phones = phones;
    }

    public Set<PersonType> getPersonTypes() {
        return personTypes;
    }

    public void setPersonTypes(Set<PersonType> personTypes) {
        this.personTypes = personTypes;
    }

    public boolean isDefaultContactPerson() {
        return defaultContactPerson;
    }

    public void setDefaultContactPerson(boolean defaultContactPerson) {
        this.defaultContactPerson = defaultContactPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultPerson)) return false;
        if (!super.equals(o)) return false;

        DefaultPerson person = (DefaultPerson) o;

        if (!firstName.equals(person.firstName)) return false;
        if (gender != person.gender) return false;
        if (!lastName.equals(person.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }
}
