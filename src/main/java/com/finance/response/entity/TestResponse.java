/*
 * FileName: TestResponse.java
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
 * 511.101       2 Jan, 2020       Ajimon      Initial Code  
 */

package com.finance.response.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Class TestResponse.
 */
public class TestResponse {

    /** The test id. */
    @ApiModelProperty(value = "testId for the test")
    private String testId;

    /** The name. */
    @ApiModelProperty(value = "name for the test")
    private String name;

    /** The test description. */
    @ApiModelProperty(value = "testDescription for the test")
    private String testDescription;

    /**
     * Gets the test id.
     *
     * @return the test id
     */
    public String getTestId() {
        return testId;
    }

    /**
     * Sets the test id.
     *
     * @param testId the new test id
     */
    public void setTestId(String testId) {
        this.testId = testId;
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
     * Gets the test description.
     *
     * @return the test description
     */
    public String getTestDescription() {
        return testDescription;
    }

    /**
     * Sets the test description.
     *
     * @param testDescription the new test description
     */
    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

}
