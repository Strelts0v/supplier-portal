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
@Table(name = "clients")
public class Supplier {

    @Column(name = "Client_ID")
    @Id
    private int clientId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LOGO")
    private String logo;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "CLIENT_STATUS")
    private String clientStatus;
    @Column(name = "CLIENT_LIBRARY_PATH")
    private String clientLibraryPath;
    @Column(name = "CLIENT_KEY")
    private String clientKey;
    @Column(name = "CREATED_BY")
    private Integer createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "UPDATED_BY")
    private Integer updatedBy;
    @Column(name = "LAST_UPDATE")
    private Date lastUpdate;
    @Column(name = "DOCS_PATH")
    private String docsPath;
    @Column(name = "ERP")
    private String erp;
    @Column(name = "EMAIL_DOMAIN")
    private String emailDomain;
    @Column(name = "DATABASE")
    private String database;
    @Column(name = "BATCH_EMAIL")
    private String batchEmail;
    @Column(name = "LAST_REFRESH")
    private String lastRefresh;
    @Column(name = "REQUIRE_XML")
    private Integer requireXml;
    @Column(name = "EBS_VERSION")
    private String ebsVersion;
    @Column(name = "NO_TAX")
    private int noTax;
    @Column(name = "AVATAR")
    private String avatar;
    @Column(name = "URL")
    private String url;
    @Column(name = "REQUIRE_OU_AT_SUBMISSION")
    private String requireOuAtSubmission;
}
