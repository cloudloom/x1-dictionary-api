package com.tracebucket.x1.dictionary.api.domain;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * @author ffl
 * @since 11-04-2014
 */
public interface Person {
	String getFirstName();

	String getLastName();

	Date getBirthDay();

	Gender getGender();

	String getImage();

	Map<String, EmailType> getEmails();

	Map<String, PhoneType> getPhones();

	Set<PersonType> getPersonTypes();
}
