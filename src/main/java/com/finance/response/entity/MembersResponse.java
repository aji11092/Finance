/*
 * FileName: MembersResponse.java
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
package com.finance.response.entity;

import com.finance.request.entity.NomineeRequest;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class MembersResponse.
 */
public class MembersResponse {

    /** The member id. */
    @ApiModelProperty(value = "memberId for the Members")
    private String memberId;

    /** The member form no. */
    @ApiModelProperty(value = "member_form_no for the Members")
    private String memberFormNo;

    /** The name. */
    @ApiModelProperty(value = "name for the Members")
    private String name;

    /** The nominee details. */
    @ApiModelProperty(value = "nomineeDetails for the Members")
    private NomineeRequest nomineeDetails;

    /** The phone number. */
    @ApiModelProperty(value = "name for the Members")
    private String phoneNumber;

    /** The aadhar number. */
    @ApiModelProperty(value = "name for the Members")
    private String aadharNumber;

    /** The description. */
    @ApiModelProperty(value = "description for the Members")
    private String description;

    /**
     * Gets the member id.
     *
     * @return the member id
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the member id.
     *
     * @param memberId the new member id
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
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
     * Gets the nominee details.
     *
     * @return the nominee details
     */
    public NomineeRequest getNomineeDetails() {
        return nomineeDetails;
    }

    /**
     * Sets the nominee details.
     *
     * @param nomineeDetails the new nominee details
     */
    public void setNomineeDetails(NomineeRequest nomineeDetails) {
        this.nomineeDetails = nomineeDetails;
    }

    /**
     * Gets the phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber the new phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the aadhar number.
     *
     * @return the aadhar number
     */
    public String getAadharNumber() {
        return aadharNumber;
    }

    /**
     * Sets the aadhar number.
     *
     * @param aadharNumber the new aadhar number
     */
    public void setAadharNumber(String aadharNumber) {
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

}
