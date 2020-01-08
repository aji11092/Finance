/*
 * FileName: Members.java
 * Author  : Ajimon
 * 
 * Using JRE 1.8.0_211
 * 
 * Copyright(c) 2020 Finance.
 * Duplication or distribution of this code in part or in whole by any media
 * without the express written permission of Finance or its agents is
 * strictly prohibited.
 *  
 * REVISION         DATE        NAME       DESCRIPTION
 * 511.101       4 Jan, 2020       Ajimon      Initial Code  
 */
package com.finance.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * The Class Members.
 */
@Entity
@Table(name = "members_details")
public class Members {

    /** The member id. */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "member_id")
    @ApiModelProperty(value = "memberId for the Members")
    private UUID memberId;

    /** The member form no. */
    @ApiModelProperty(value = "memberFormNo for the Members")
    @Column(name = "member_form_no", nullable = false)
    private String memberFormNo;

    /** The nominee details. */
    @ApiModelProperty(value = "nomineeDetails for the Members")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nominee_id")
    private NomineeDetails nomineeDetails;

    /** The name. */
    @ApiModelProperty(value = "name for the Members")
    @Column(name = "name", nullable = false)
    private String name;

    /** The phone number. */
    @ApiModelProperty(value = "phoneNumber for the Members")
    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;

    /** The aadhar number. */
    @ApiModelProperty(value = "aadharNumber for the Members")
    @Column(name = "aadhar_number", nullable = false)
    private int aadharNumber;

    /** The description. */
    @ApiModelProperty(value = "description for the Members")
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    /**
     * Gets the member id.
     *
     * @return the member id
     */
    public UUID getMemberId() {
        return memberId;
    }

    /**
     * Sets the member id.
     *
     * @param memberId the new member id
     */
    public void setMemberId(UUID memberId) {
        this.memberId = memberId;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the phone number.
     *
     * @return the phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber the new phone number
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the aadhar number.
     *
     * @return the aadhar number
     */
    public int getAadharNumber() {
        return aadharNumber;
    }

    /**
     * Sets the aadhar number.
     *
     * @param aadharNumber the new aadhar number
     */
    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the member form no.
     *
     * @return the member form no
     */
    public String getMemberFormNo() {
        return memberFormNo;
    }

    /**
     * Sets the member form no.
     *
     * @param memberFormNo the new member form no
     */
    public void setMemberFormNo(String memberFormNo) {
        this.memberFormNo = memberFormNo;
    }

    /**
     * Gets the nominee details.
     *
     * @return the nominee details
     */
    public NomineeDetails getNomineeDetails() {
        return nomineeDetails;
    }

    /**
     * Sets the nominee details.
     *
     * @param nomineeDetails the new nominee details
     */
    public void setNomineeDetails(NomineeDetails nomineeDetails) {
        this.nomineeDetails = nomineeDetails;
    }

}
