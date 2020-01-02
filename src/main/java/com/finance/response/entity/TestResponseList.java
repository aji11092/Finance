/*
 * FileName: TestResponseList.java
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
package com.finance.response.entity;

import java.util.List;


public class TestResponseList {

    /** The test responses. */
    private List<TestResponse> testResponses;

    /** The total count. */
    private long totalCount;

    /**
     * Gets the test responses.
     *
     * @return the test responses
     */
    public List<TestResponse> getTestResponses() {
        return testResponses;
    }

    /**
     * Sets the test responses.
     *
     * @param testResponses the new test responses
     */
    public void setTestResponses(List<TestResponse> testResponses) {
        this.testResponses = testResponses;
    }

    /**
     * Gets the total count.
     *
     * @return the total count
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the total count.
     *
     * @param totalCount the new total count
     */
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

}
