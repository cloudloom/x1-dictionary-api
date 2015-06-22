package com.tracebucket.x1.dictionary.api.domain.jpa.impl;

import com.tracebucket.tron.ddd.domain.BaseValueObject;
import com.tracebucket.x1.dictionary.api.domain.Validity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sadath on 22-Jun-2015.
 */
@Embeddable
public class DefaultValidity extends BaseValueObject implements Validity {
    @Column(name = "VALID_FROM")
    @Basic(fetch = FetchType.EAGER)
    @Temporal(TemporalType.TIMESTAMP)
    private Date validFrom;

    @Column(name = "VALID_TILL")
    @Basic(fetch = FetchType.EAGER)
    @Temporal(TemporalType.TIMESTAMP)
    private Date validTill;

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }
}