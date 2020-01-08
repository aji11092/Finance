/*
 * FileName: MemberRegisterConverterHelper.java
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
package com.finance.helper;

import com.finance.model.Members;
import com.finance.model.NomineeDetails;
import com.finance.request.entity.MembersRequest;
import com.google.common.base.Strings;
import java.util.UUID;

/**
 * The Class MemberRegisterConverterHelper.
 */
public class MemberRegisterConverterHelper {

    /**
     * Gets the members from entity.
     *
     * @param membersRequest the members request
     * @return the members from entity
     */
    public static Members getMembersFromEntity(MembersRequest membersRequest) {
        Members members = new Members();
        NomineeDetails nomineeDetails = new NomineeDetails();
        if (!Strings.isNullOrEmpty(membersRequest.getMemberFormNo())) {
            members.setMemberFormNo(membersRequest.getMemberFormNo());
        }
        if (!Strings.isNullOrEmpty(membersRequest.getAadharNumber())) {
            members.setAadharNumber(Integer.parseInt(membersRequest.getAadharNumber()));
        }
        if (!Strings.isNullOrEmpty(membersRequest.getName())) {
            members.setName(membersRequest.getName());
        }
        
        if (membersRequest.getNomineeRequest()!=null) {
            if (!Strings.isNullOrEmpty(membersRequest.getNomineeRequest().getName())) {
                nomineeDetails.setName(membersRequest.getNomineeRequest().getName());
            } 
            if (!Strings.isNullOrEmpty(membersRequest.getNomineeRequest().getPhoneNumber())) {
                int qqq=Integer.parseInt(membersRequest.getNomineeRequest().getPhoneNumber());
                nomineeDetails.setPhoneNumber(Integer.parseInt(membersRequest.getNomineeRequest().getPhoneNumber()));
            } 
            if (!Strings.isNullOrEmpty(membersRequest.getNomineeRequest().getNomineeId())) {
                nomineeDetails.setNomineeId(UUID.fromString(membersRequest.getNomineeRequest().getNomineeId()));
            } 
            members.setNomineeDetails(nomineeDetails);
        }
        return members;
    }
}
