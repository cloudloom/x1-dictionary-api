package com.tracebucket.x1.dictionary.api.domain;

import java.util.Date;

/**
 * Created by sadath on 22-Jun-2015.
 */
public interface Validity {
    public Date getValidFrom();

    public void setValidFrom(Date validFrom);

    public Date getValidTill();

    public void setValidTill(Date validTill);
}