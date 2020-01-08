/*
 * FileName: MemberRegisterDelegateImpl.java
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
package com.finance.delegate.impl;

import com.finance.common.Response;
import com.finance.delegate.MemberRegisterDelegate;
import com.finance.request.entity.MembersRequest;
import com.finance.service.MemberRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * The Class MemberRegisterDelegateImpl.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MemberRegisterDelegateImpl implements MemberRegisterDelegate {

    /** The service. */
    @Autowired
    MemberRegisterService service;

    /* (non-Javadoc)
     * @see com.finance.delegate.MemberRegisterDelegate#createMember(com.finance.request.entity.MembersRequest)
     */
    @Override
    public Response createMember(MembersRequest membersRequest) {

        return service.createMember(membersRequest);
    }

    /* (non-Javadoc)
     * @see com.finance.delegate.MemberRegisterDelegate#deleteMembersByMemberId(java.lang.String)
     */
    @Override
    public Response deleteMembersByMemberId(String memberId) {

        return service.deleteMembersByMemberId(memberId);
    }

    /* (non-Javadoc)
     * @see com.finance.delegate.MemberRegisterDelegate#getMembersByMemberId(java.lang.String)
     */
    @Override
    public Response getMembersByMemberId(String memberId) {

        return service.getMembersByMemberId(memberId);
    }

    /* (non-Javadoc)
     * @see com.finance.delegate.MemberRegisterDelegate#getAllMembers(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getAllMembers(String categoryId, int pageSize, int pageNumber, String sortOrder, String sortKey,
        String searchKey, String partnerId, String mobile) {

        return service.getAllMembers(categoryId, pageSize, pageNumber, sortOrder, sortKey, searchKey, partnerId,
            mobile);
    }

    /* (non-Javadoc)
     * @see com.finance.delegate.MemberRegisterDelegate#updateMember(com.finance.request.entity.MembersRequest)
     */
    @Override
    public Response updateMember(MembersRequest membersRequest) {

        return service.updateMember(membersRequest);
    }

}
