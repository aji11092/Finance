/*
 * FileName: TestRepository.java
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
package com.finance.repository;

import com.finance.model.Test;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * The Interface TestRepository.
 */
public interface TestRepository extends JpaRepository<Test, Integer> {

    /**
     * Gets the test bytest id.
     *
     * @param testId the test id
     * @return the test bytest id
     */
    Test getTestBytestId(UUID testId);


}
