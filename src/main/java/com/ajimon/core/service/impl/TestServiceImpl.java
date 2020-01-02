/*
 * FileName: TestServiceImpl.java
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
package com.ajimon.core.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ajimon.core.common.Response;
import com.ajimon.core.repository.TestRepository;
import com.ajimon.core.request.entity.TestRequest;
import com.ajimon.core.service.TestService;

/**
 * The Class TestServiceImpl.
 */
@Service
public class TestServiceImpl implements TestService {

    /** The test repository. */
    @Autowired
    TestRepository testRepository;

	@Override
	public Response createTest(TestRequest testRequest) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateTest(TestRequest testRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAllTest(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
			String userId, String partnerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteTestBytestId(String testId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getTestBytestId(String testId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response testAgainstAddGroups(TestRequest testRequest) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAllTestByCategoryId(int pageSize, int pageNumber, String sortOrder, String sortKey,
			String searchKey, String userId, String partnerId, String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

   

}
