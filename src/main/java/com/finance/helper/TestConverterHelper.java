/*
 * FileName: TestConverterHelper.java
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

package com.finance.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import com.finance.model.Test;
import com.finance.request.entity.TestRequest;
import com.finance.response.entity.TestResponse;
import com.finance.response.entity.TestResponseList;

/**
 * The Class TestConverterHelper.
 */
public class TestConverterHelper {

    /** The formatter. */
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * Gets the test request.
     *
     * @param testRequest the test request
     * @return the test request
     * @throws ParseException the parse exception
     */
    public static Test getTestRequest(TestRequest testRequest) throws ParseException {
        Test test = new Test();

        return test;
    }

    /**
     * Gets the test from entity.
     *
     * @param test the test
     * @return the test from entity
     */
    public static TestResponse getTestFromEntity(Test test) {
        TestResponse testResponse = new TestResponse();

        return testResponse;
    }

    /**
     * Gets the test from entity list.
     *
     * @param testList the test list
     * @param totalCount the total count
     * @return the test from entity list
     */
    public static TestResponseList getTestFromEntityList(List<Test> testList, long totalCount) {
        TestResponseList testResponseList = new TestResponseList();
        List<TestResponse> testResponse = new ArrayList<>();
        if (testList != null) {
            for (Test test : testList) {
                testResponse.add(getTestFromEntity(test));

            }
        }
        testResponseList.setTestResponses(testResponse);
        testResponseList.setTotalCount(totalCount);
        return testResponseList;
    }

}
