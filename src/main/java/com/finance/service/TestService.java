/*
 * FileName: TestService.java
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

package com.finance.service;

import com.finance.common.Response;
import com.finance.request.entity.TestRequest;
import java.text.ParseException;

/**
 * The Interface TestService.
 */
public interface TestService {

    /**
     * Creates the test.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    Response createTest(TestRequest testRequest) throws ParseException;

    /**
     * Update test.
     *
     * @param testRequest the test request
     * @return the response
     */
    Response updateTest(TestRequest testRequest);

    /**
     * Gets the all test.
     *
     * @param pageSize the page size
     * @param pageNumber the page number
     * @param sortOrder the sort order
     * @param sortKey the sort key
     * @param searchKey the search key
     * @param userId the user id
     * @param partnerId the partner id
     * @return the all test
     */
    Response getAllTest(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey, String userId,
        String partnerId);

    /**
     * Delete test bytest id.
     *
     * @param testId the test id
     * @return the object
     */
    Object deleteTestBytestId(String testId);

    /**
     * Gets the test bytest id.
     *
     * @param testId the test id
     * @return the test bytest id
     */
    Response getTestBytestId(String testId);

    /**
     * Test against add groups.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    Response testAgainstAddGroups(TestRequest testRequest) throws ParseException;

    /**
     * Gets the all test by category id.
     *
     * @param pageSize the page size
     * @param pageNumber the page number
     * @param sortOrder the sort order
     * @param sortKey the sort key
     * @param searchKey the search key
     * @param userId the user id
     * @param partnerId the partner id
     * @param categoryId the category id
     * @return the all test by category id
     */
    Response getAllTestByCategoryId(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
        String userId, String partnerId, String categoryId);

}
