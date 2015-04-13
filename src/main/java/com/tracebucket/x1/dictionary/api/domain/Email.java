package com.tracebucket.x1.dictionary.api.domain;


/**
 * @author ffl
 * @since 11-04-2014
 */
public interface Email {
	String getEmail();

	EmailType getEmailType();

	boolean isDefaultEmail();
}
