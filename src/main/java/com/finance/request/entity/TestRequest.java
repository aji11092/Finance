/*
 * FileName: TestRequest.java
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
package com.finance.request.entity;



import io.swagger.annotations.ApiModelProperty;

/**
 * The Class TestRequest.
 */
public class TestRequest {


    /** The test id. */
    @ApiModelProperty(value = "testId for the TestRequest")
    private String testId;

    /** The name. */
    @ApiModelProperty(value = "name for the TestRequest")
    private String name;

    /** The test description. */
    @ApiModelProperty(value = "testDescription for the TestRequest")
    private String testDescription;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
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
