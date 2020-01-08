/*
 * FileName: MemberRegisterServiceImpl.java
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
package com.finance.service.impl;

import com.finance.common.ErrorCode;
import com.finance.common.ErrorMessages;
import com.finance.common.Response;
import com.finance.exception.CommonException;
import com.finance.helper.MemberRegisterConverterHelper;
import com.finance.model.Members;
import com.finance.model.NomineeDetails;
import com.finance.repository.MembersRepository;
import com.finance.repository.NomineeDetailsRepository;
import com.finance.request.entity.MembersRequest;
import com.finance.service.MemberRegisterService;
import com.finance.util.Constants;
import com.finance.util.ParamErrors;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 * The Class MemberRegisterServiceImpl.
 */
@Service
public class MemberRegisterServiceImpl implements MemberRegisterService {

    /** The test repository. */
    @Autowired
    MembersRepository membersRepository;
    @Autowired
    NomineeDetailsRepository nomineeDetailsRepository;

    /* (non-Javadoc)
     * @see com.finance.service.MemberRegisterService#createMember(com.finance.request.entity.MembersRequest)
     */
    @Override
    public Response createMember(MembersRequest membersRequest) {
        List<ParamErrors> paramErrorsList = new ArrayList<>();
        ParamErrors paramErrors = new ParamErrors();
        Members members = new Members();
        NomineeDetails nomineeDetails = new NomineeDetails();
        try {
            if (membersRequest.getMemberFormNo() == null) {
                paramErrors.setParamName(Constants.GROUP_CODE);
                paramErrors.setError(Constants.GROUP_CODE_IS_REQUIRED);
                paramErrorsList.add(paramErrors);
            }

            members = MemberRegisterConverterHelper.getMembersFromEntity(membersRequest);

            if (!paramErrorsList.isEmpty()) {
                throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
            }
            nomineeDetails= nomineeDetailsRepository.save(members.getNomineeDetails());
            members.setNomineeDetails(nomineeDetails);
            members = membersRepository.save(members);
        } catch (DataIntegrityViolationException e) {
            throw new CommonException(ErrorCode.DUPLICATION.toString(), Constants.MEMBER_NOT_EXIST, null);
        }
        return null;
        // ResponseHelper.getSuccessResponse(Constants.MEMBER_CREATED,
        // GroupMemberConverterHelper.getMemberGroupFromEntity(groupMember), Constants.MEMBER_CREATE_SUCCESS);
    }

    /* (non-Javadoc)
     * @see com.finance.service.MemberRegisterService#deleteMembersByMemberId(java.lang.String)
     */
    @Override
    public Response deleteMembersByMemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.MemberRegisterService#getMembersByMemberId(java.lang.String)
     */
    @Override
    public Response getMembersByMemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.MemberRegisterService#getAllMembers(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getAllMembers(String categoryId, int pageSize, int pageNumber, String sortOrder, String sortKey,
        String searchKey, String partnerId, String mobile) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.finance.service.MemberRegisterService#updateMember(com.finance.request.entity.MembersRequest)
     */
    @Override
    public Response updateMember(MembersRequest membersRequest) {
        // TODO Auto-generated method stub
        return null;
    }

}
