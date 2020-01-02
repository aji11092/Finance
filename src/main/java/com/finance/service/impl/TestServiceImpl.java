/*
 * FileName: TestServiceImpl.java
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

package com.finance.service.impl;

import com.finance.common.Response;
import com.finance.repository.TestRepository;
import com.finance.request.entity.TestRequest;
import com.finance.service.TestService;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TestServiceImpl.
 */
@Service
public class TestServiceImpl implements TestService {

    /** The test repository. */
    @Autowired
    TestRepository testRepository;

    /* (non-Javadoc)
     * @see com.finance.service.TestService#createTest(com.finance.request.entity.TestRequest)
     */
    @Override
    public Response createTest(TestRequest testRequest) throws ParseException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.TestService#updateTest(com.finance.request.entity.TestRequest)
     */
    @Override
    public Response updateTest(TestRequest testRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.TestService#getAllTest(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getAllTest(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
        String userId, String partnerId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.TestService#deleteTestBytestId(java.lang.String)
     */
    @Override
    public Object deleteTestBytestId(String testId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.TestService#getTestBytestId(java.lang.String)
     */
    @Override
    public Response getTestBytestId(String testId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.TestService#testAgainstAddGroups(com.finance.request.entity.TestRequest)
     */
    @Override
    public Response testAgainstAddGroups(TestRequest testRequest) throws ParseException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.TestService#getAllTestByCategoryId(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getAllTestByCategoryId(int pageSize, int pageNumber, String sortOrder, String sortKey,
        String searchKey, String userId, String partnerId, String categoryId) {
        // TODO Auto-generated method stub
        return null;
    }

}
