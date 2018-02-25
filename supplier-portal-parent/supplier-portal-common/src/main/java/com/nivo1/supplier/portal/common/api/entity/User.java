package com.nivo1.supplier.portal.common.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter

@Entity
@Table(name = "users")
public class User {

    @Column(name = "USER_ID")
    @Id
    private int userId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CLIENT_ID")
    private int clientId;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private String createdDate;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_DATE")
    private String updatedDate;
    @Column(name = "SALT")
    private String salt;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "WEBSERVICE")
    private Integer webservice;
    @Column(name = "LAST_REFRESH")
    private String lastRefresh;
    @Column(name = "SERVICE_ACCT")
    private Integer serviceAccount;
    @Column(name = "LIMITED_ORG")
    private int limitedOrg;
    @Column(name = "ORG_ID_DEFAULT")
    private int orgIdDefault;
    @Column(name = "ALLOW_REVIEW_WORK")
    private int allowReviewWork;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "MANAGER_NAME")
    private String managerName;
    @Column(name = "DELEGATE_NAME")
    private String delegateName;
    @Column(name = "APPROVAL_LIMIT")
    private String approvalLimit;
    @Column(name = "MANAGER_ID")
    private int managerId;
    @Column(name = "DELEGATE_ID")
    private int delegateId;
    @Column(name = "ON_VACATION")
    private int onVacation;
    @Column(name = "ENABLED")
    private int enabled;
    @Column(name = "INACTIVE_START_DATE")
    private String inactiveStartDate;
    @Column(name = "INACTIVE_END_DATE")
    private String inactiveEndDate;
    @Column(name = "USE_DATE_RANGE")
    private int useDateRange;
    @Column(name = "COOKIE")
    private String cookie;
    @Column(name = "LIMIT_ACCOUNTS")
    private int limitAccounts;
    @Column(name = "MODEL_ONLY")
    private int modelOnly;
    @Column(name = "ATTR1")
    private String attribute1;
    @Column(name = "LANGUAGE")
    private String language;
}
