package com.tracebucket.x1.dictionary.api.domain;

/**
 * @author ffl
 * @since 11-04-2014
 */
public interface Timezone {
	String getName();

	String getAbbreviation();

	Integer getUtcOffset();

	String getImage();

	TimezoneType getTimezoneType();
}
