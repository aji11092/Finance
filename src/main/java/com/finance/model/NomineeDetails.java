/*
 * FileName: NomineeDetails.java
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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * The Class NomineeDetails.
 */
@Entity
@Table(name = "nominee_details")
public class NomineeDetails {

    /** The nominee id. */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "nominee_id")
    @ApiModelProperty(value = "nomineeId for the NomineeDetails")
    private UUID nomineeId;

    /** The name. */
    @ApiModelProperty(value = "name for the NomineeDetails")
    @Column(name = "name", nullable = false)
    private String name;

    /** The phone number. */
    @ApiModelProperty(value = "phoneNumber for the NomineeDetails")
    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;

    /** The aadhar number. */
    @ApiModelProperty(value = "aadharNumber for the NomineeDetails")
    @Column(name = "aadhar_number", nullable = false)
    private int aadharNumber;

    /** The description. */
    @ApiModelProperty(value = "description for the NomineeDetails")
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    /**
     * Gets the nominee id.
     *
     * @return the nominee id
     */
    public UUID getNomineeId() {
        return nomineeId;
    }

    /**
     * Sets the nominee id.
     *
     * @param nomineeId the new nominee id
     */
    public void setNomineeId(UUID nomineeId) {
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

}
