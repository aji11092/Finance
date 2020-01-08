/*
 * FileName: NomineeResponse.java
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

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;

/**
 * The Class NomineeResponse.
 */
public class NomineeResponse {

    /** The nominee id. */
    @ApiModelProperty(value = "memberId for the Members")
    private String nomineeId;

    /** The name. */
    @ApiModelProperty(value = "name for the Members")
    @Column(name = "name", nullable = false)
    private String name;

    /** The phone number. */
    @ApiModelProperty(value = "name for the Members")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    /** The aadhar number. */
    @ApiModelProperty(value = "name for the Members")
    @Column(name = "aadhar_number", nullable = false)
    private String aadharNumber;

    /** The description. */
    @ApiModelProperty(value = "description for the Members")
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    /**
     * Gets the nominee id.
     *
     * @return the nominee id
     */
    public String getNomineeId() {
        return nomineeId;
    }

    /**
     * Sets the nominee id.
     *
     * @param nomineeId the new nominee id
     */
    public void setNomineeId(String nomineeId) {
        this.nomineeId = nomineeId;
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
