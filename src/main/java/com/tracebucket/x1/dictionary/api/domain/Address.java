package com.tracebucket.x1.dictionary.api.domain;


/**
 * @author ffl
 * @since 11-04-2014
 */
public interface Address {
	String getName();

	String getBuilding();

	String getStreet();

	String getRegion();

	String getCity();

	String getDistrict();

	String getState();

	String getCountry();

	String getZip();

	AddressType getAddressType();

	boolean isDefaultAddress();
}
