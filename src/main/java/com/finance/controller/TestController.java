/*
 * FileName: TestController.java
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

package com.finance.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.finance.common.Response;
import com.finance.delegate.TestDeligate;
import com.finance.exception.CommonException;
import com.finance.request.entity.TestRequest;
import com.google.common.base.Strings;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class TestController.
 */
@RestController
@RequestMapping({"/core/v1.0/test", "/core/v1.1/test"})
@Api(tags = "TestController")
@CrossOrigin
public class TestController {

    /** The test deligate. */
    @Autowired
    TestDeligate testDeligate;

    /**
     * create Test.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PostMapping
    @ResponseBody
    @ApiOperation(value = "To save a createTest", notes = "A createTest can be created with its fields")
    public Response createTest(@RequestBody TestRequest testRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = testDeligate.createTest(testRequest);
        } catch (CommonException e) {
        }
        return responseObj;
    }

    /**
     * update Test.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PutMapping
    @ApiOperation(value = "To update a updateTest", notes = "A updateTest  with its fields")
    public Response updateTest(@RequestBody TestRequest testRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = testDeligate.updateTest(testRequest);
        } catch (CommonException e) {
        }
        return responseObj;
    }

    /**
     * get Test By using testId.
     *
     * @param groupId the group id
     * @return the test bytest id
     */
    @GetMapping
    @ApiOperation(value = "To find a testDetails", notes = "Selecting testDetails using testId")
    public Response getTestBytestId(@RequestParam("testId") String groupId) {
        Response responseObj = null;
        try {
            responseObj = testDeligate.getTestBytestId(groupId);
        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return responseObj;

    }

    /**
     * get All Test.
     *
     * @param pageSize the page size
     * @param pageNumber the page number
     * @param sortOrder the sort order
     * @param sortKey the sort key
     * @param searchKey the search key
     * @param userId the user id
     * @param partnerId the partner id
     * @return the all test
     * @throws JsonProcessingException the json processing exception
     * @throws ParseException the parse exception
     * @throws UnsupportedEncodingException the unsupported encoding exception
     */
    @GetMapping(value = "/all")
    @ApiOperation(value = "To get all test", notes = "Fetching all test by giving page size and page")
    public Response getAllTest(@RequestParam(value = "pageSize", required = false) int pageSize,
        @RequestParam(value = "pageNumber", required = false) int pageNumber,
        @RequestParam(value = "sortOrder", required = false) String sortOrder,
        @RequestParam(value = "sortKey", required = false) String sortKey,
        @RequestParam(value = "searchKey", required = false) String searchKey,
        @RequestParam(value = "userId", required = false) String userId,
        @RequestParam(value = "partnerId", required = false) String partnerId)
        throws JsonProcessingException, ParseException, UnsupportedEncodingException {
        Response responseObj = null;
        try {
            if (!Strings.isNullOrEmpty(searchKey)) {
                searchKey = URLDecoder.decode(searchKey, "UTF-8");
            }
            responseObj =
                testDeligate.getAllTest(pageSize, pageNumber, sortOrder, sortKey, searchKey, userId, partnerId);

        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return responseObj;
    }

    /**
     * delete Test By using testId.
     *
     * @param testId the test id
     * @return the response
     */
    @DeleteMapping
    @ApiOperation(value = "To delete a test", notes = "Deleting test selecting it by using testId")
    public Response deleteTestBytestId(@RequestParam("testId") String testId) {
        @SuppressWarnings("unused")
        Response responseObj = null;
        try {
            testDeligate.deleteTestBytestId(testId);
        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return null;
        // ResponseHelper.getSuccessResponse("test Deleted", "DELETED", "TEST_DELETED_SUCCESS");
    }

    /**
     * test Against Add Groups.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PostMapping(value = "/addGroups")
    @ResponseBody
    @ApiOperation(value = "To save a testAgainstAddGroups", notes = "A testAgainstAddGroups can be created with its fields")
    public Response testAgainstAddGroups(@RequestBody TestRequest testRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = testDeligate.testAgainstAddGroups(testRequest);
        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return responseObj;
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
     * @param categoryId the category id
     * @param partnerId the partner id
     * @return the all test by category id
     * @throws JsonProcessingException the json processing exception
     * @throws ParseException the parse exception
     * @throws UnsupportedEncodingException the unsupported encoding exception
     */
    @GetMapping(value = "/categoryTest")
    @ApiOperation(value = "To get all getAllTestByCategoryId", notes = "Fetching all getAllTestByCategoryId by giving page size and page")
    public Response getAllTestByCategoryId(@RequestParam(value = "pageSize", required = false) int pageSize,
        @RequestParam(value = "pageNumber", required = false) int pageNumber,
        @RequestParam(value = "sortOrder", required = false) String sortOrder,
        @RequestParam(value = "sortKey", required = false) String sortKey,
        @RequestParam(value = "searchKey", required = false) String searchKey,
        @RequestParam(value = "userId", required = false) String userId,
        @RequestParam(value = "categoryId", required = false) String categoryId,
        @RequestParam(value = "partnerId", required = false) String partnerId)
        throws JsonProcessingException, ParseException, UnsupportedEncodingException {
        Response responseObj = null;
        try {
            if (!Strings.isNullOrEmpty(searchKey)) {
                searchKey = URLDecoder.decode(searchKey, "UTF-8");
            }
            responseObj = testDeligate.getAllTestByCategoryId(pageSize, pageNumber, sortOrder, sortKey, searchKey,
                userId, partnerId, categoryId);

        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return responseObj;
    }

}
