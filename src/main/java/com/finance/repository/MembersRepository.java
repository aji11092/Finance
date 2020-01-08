/*
 * FileName: MembersRepository.java
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
package com.finance.repository;

import com.finance.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Interface MembersRepository.
 */
public interface MembersRepository extends JpaRepository<Members, Integer> {

}
