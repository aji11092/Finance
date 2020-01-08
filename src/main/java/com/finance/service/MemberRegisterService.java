/*
 * FileName: MemberRegisterService.java
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
package com.finance.service;

import com.finance.common.Response;
import com.finance.request.entity.MembersRequest;

/**
 * The Interface MemberRegisterService.
 */
public interface MemberRegisterService {

    /**
     * Creates the member.
     *
     * @param membersRequest the members request
     * @return the response
     */
    Response createMember(MembersRequest membersRequest);

    /**
     * Delete members by member id.
     *
     * @param memberId the member id
     * @return the response
     */
    Response deleteMembersByMemberId(String memberId);

    /**
     * Gets the members by member id.
     *
     * @param memberId the member id
     * @return the members by member id
     */
    Response getMembersByMemberId(String memberId);

    /**
     * Gets the all members.
     *
     * @param categoryId the category id
     * @param pageSize the page size
     * @param pageNumber the page number
     * @param sortOrder the sort order
     * @param sortKey the sort key
     * @param searchKey the search key
     * @param partnerId the partner id
     * @param mobile the mobile
     * @return the all members
     */
    Response getAllMembers(String categoryId, int pageSize, int pageNumber, String sortOrder, String sortKey,
        String searchKey, String partnerId, String mobile);

    /**
     * Update member.
     *
     * @param membersRequest the members request
     * @return the response
     */
    Response updateMember(MembersRequest membersRequest);

}
