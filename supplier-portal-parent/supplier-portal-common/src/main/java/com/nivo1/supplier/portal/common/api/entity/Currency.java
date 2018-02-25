package com.nivo1.supplier.portal.common.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter

@Entity
@Table(name="JDE_CURRENCY")
public class Currency {

    @Column(name="ID")
    @Id
    private Integer id;
    @Column(name="CURRENCY_CODE")
    private String currencyCode;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="DISPLAY_DECIMALS")
    private String displayDecimals;
    @Column(name="CREATION_DATE")
    private Date creationDate;
    @Column(name="CREATED_BY")
    private Integer createdBy;
    @Column(name="LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name="LAST_UPDATED_BY")
    private Integer lastUpdatedBy;
}
