/*
 * FileName: MemberRegisterController.java
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
 * 511.101       4 Jan, 2020       Ajimon      Initial Code  
 */
package com.finance.controller;

import java.io.UnsupportedEncodingException;
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
import com.finance.delegate.MemberRegisterDelegate;
import com.finance.exception.CommonException;
import com.finance.request.entity.MembersRequest;
import com.finance.util.Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class MemberRegisterController.
 */
@RestController
@RequestMapping({"/core/v1.0/member", "/core/v1.1/member"})
@Api(tags = "MemberRegisterController")
@CrossOrigin
public class MemberRegisterController {

    /** The member register delegate. */
    @Autowired
    MemberRegisterDelegate memberRegisterDelegate;

    /**
     * Creates the member.
     *
     * @param membersRequest the members request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PostMapping
    @ResponseBody
    @ApiOperation(value = "To save a createCourse", notes = "A createCourse can be created with its fields")
    public Response createMember(@RequestBody MembersRequest membersRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = memberRegisterDelegate.createMember(membersRequest);
        } catch (CommonException e) {
            responseObj = Util.turfException(e);
        }
        return responseObj;
    }

    /**
     * Update member.
     *
     * @param membersRequest the members request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PutMapping

    @ApiOperation(value = "To update a updateCourse", notes = "A updateCourse  with its fields")
    public Response updateMember(@RequestBody MembersRequest membersRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = memberRegisterDelegate.updateMember(membersRequest);
        } catch (CommonException e) {
            responseObj = Util.turfException(e);
        }
        return responseObj;
    }

    /**
     * Gets the all members.
     *
     * @param categoryId the category id
     * @param pageSize the page size
     * @param pageNumber the page number
     * @param sortOrder the sort order
     * @param sortKey the sort key
     * @param partnerId the partner id
     * @param mobile the mobile
     * @param searchKey the search key
     * @return the all members
     * @throws JsonProcessingException the json processing exception
     * @throws ParseException the parse exception
     * @throws UnsupportedEncodingException the unsupported encoding exception
     */
    @GetMapping(value = "/all")

    @ApiOperation(value = "To get all course", notes = "Fetching all course by giving category")
    public Response getAllMembers(@RequestParam(value = "categoryId") String categoryId,
        @RequestParam(value = "pageSize", required = false) int pageSize,
        @RequestParam(value = "pageNumber", required = false) int pageNumber,
        @RequestParam(value = "sortOrder", required = false) String sortOrder,
        @RequestParam(value = "sortKey", required = false) String sortKey,
        @RequestParam(value = "partnerId", required = false) String partnerId,
        @RequestParam(value = "mobile", required = false) String mobile,
        @RequestParam(value = "searchKey", required = false) String searchKey)
        throws JsonProcessingException, ParseException, UnsupportedEncodingException {
        Response responseObj = null;
        try {
            responseObj = memberRegisterDelegate.getAllMembers(categoryId, pageSize, pageNumber, sortOrder, sortKey,
                searchKey, partnerId, mobile);

        } catch (CommonException e) {
            responseObj = new Response();
            responseObj.setSuccess(false);
        }
        return responseObj;
    }

    /**
     * Gets the members by member id.
     *
     * @param memberId the member id
     * @return the members by member id
     */
    @GetMapping

    @ApiOperation(value = "To find a courseDetails", notes = "Selecting courseDetails using courseId")
    public Response getMembersByMemberId(@RequestParam("memberId") String memberId) {
        Response responseObj = null;
        try {
            responseObj = memberRegisterDelegate.getMembersByMemberId(memberId);
        } catch (CommonException e) {
            responseObj = Util.turfException(e);
        }
        return responseObj;

    }

    /**
     * Delete members by member id.
     *
     * @param memberId the member id
     * @return the response
     */
    @DeleteMapping
    @ApiOperation(value = "To delete a course", notes = "Deleting course selecting it by using courseId")
    public Response deleteMembersByMemberId(@RequestParam("memberId") String memberId) {
        Response responseObj = null;
        try {
            responseObj = memberRegisterDelegate.deleteMembersByMemberId(memberId);
        } catch (CommonException e) {
            responseObj = Util.turfException(e);
        }
        return responseObj;
    }

}
