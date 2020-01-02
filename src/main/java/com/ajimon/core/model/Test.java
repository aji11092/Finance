/*
 * FileName: Test.java
 * Author  : CY0180
 * 
 * Using JRE 1.8.0_211
 * 
 * Copyright(c) 2019 Cycloides Technologies.
 * Duplication or distribution of this code in part or in whole by any media
 * without the express written permission of Cycloides Technologies or its agents is
 * strictly prohibited.
 *  
 * REVISION         DATE            NAME     DESCRIPTION
 * 511.101       21 Sep, 2019       Ajimon      Initial Code  
 */
package com.ajimon.core.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;


import io.swagger.annotations.ApiModelProperty;

/**
 * The Class Test.
 */
@Entity
@Table(name = "test")
public class Test {

    /** The Constant serialVersionUID. */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 1L;

    /** The test id. */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "test_id")
    @ApiModelProperty(value = "testId for the test")
    private UUID testId;

    /** The name. */
    @ApiModelProperty(value = "name for the test")
    @Column(name = "name", nullable = false)
    private String name;

    /** The test description. */
    @ApiModelProperty(value = "testDescription for the test")
    @Column(name = "test_description", columnDefinition = "TEXT")
    private String testDescription;

	public UUID getTestId() {
		return testId;
	}

	public void setTestId(UUID testId) {
		this.testId = testId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

   

}
