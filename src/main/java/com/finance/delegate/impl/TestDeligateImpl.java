/*
 * FileName: TestDeligateImpl.java
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
package com.finance.delegate.impl;

import com.finance.common.Response;
import com.finance.delegate.TestDeligate;
import com.finance.request.entity.TestRequest;
import com.finance.service.TestService;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * The Class TestDeligateImpl.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestDeligateImpl implements TestDeligate {

    /** The service. */
    @Autowired
    TestService service;

    /**
     * Creates the test.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @Override
    public Response createTest(TestRequest testRequest) throws ParseException {

        return service.createTest(testRequest);
    }

    /**
     * Update test.
     *
     * @param testRequest the test request
     * @return the response
     */
    @Override
    public Response updateTest(TestRequest testRequest) {

        return service.updateTest(testRequest);
    }

    /**
     * Gets the test bytest id.
     *
     * @param testId the test id
     * @return the test bytest id
     */
    @Override
    public Response getTestBytestId(String testId) {

        return service.getTestBytestId(testId);
    }

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
    @Override
    public Response getAllTest(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
        String userId, String partnerId) {

        return service.getAllTest(pageSize, pageNumber, sortOrder, sortKey, searchKey, userId, partnerId);
    }

    /**
     * Delete test bytest id.
     *
     * @param testId the test id
     * @return the object
     */
    @Override
    public Object deleteTestBytestId(String testId) {

        return service.deleteTestBytestId(testId);
    }

    /**
     * Test against add groups.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @Override
    public Response testAgainstAddGroups(TestRequest testRequest) throws ParseException {

        return service.testAgainstAddGroups(testRequest);
    }

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
    @Override
    public Response getAllTestByCategoryId(int pageSize, int pageNumber, String sortOrder, String sortKey,
        String searchKey, String userId, String partnerId, String categoryId) {

        return service.getAllTestByCategoryId(pageSize, pageNumber, sortOrder, sortKey, searchKey, userId, partnerId,
            categoryId);
    }

}
