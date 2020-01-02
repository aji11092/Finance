/*
 * FileName: TestConverterHelper.java
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
 * 511.102       21 Sep, 2019       Ajimon      changed coding standards 
 */
package com.finance.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.finance.model.Test;
import com.finance.request.entity.TestRequest;
import com.finance.response.entity.TestResponse;
import com.finance.response.entity.TestResponseList;
import com.google.common.base.Strings;

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
