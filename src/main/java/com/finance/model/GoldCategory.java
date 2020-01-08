/*
 * FileName: GoldCategory.java
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
package com.finance.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * The Class GoldCategory.
 */
@Entity
@Table(name = "gold_category")
public class GoldCategory {

    /** The gold category id. */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "gold_category_id")
    @ApiModelProperty(value = "goldCategoryId for the GoldCategory")
    private UUID goldCategoryId;

    /** The member form no. */
    @ApiModelProperty(value = "name for the GoldCategory")
    @Column(name = "name", nullable = false)
    private String name;

    /** The description. */
    @ApiModelProperty(value = "description for the GoldCategory")
    @Column(name = "description", nullable = false)
    private String description;

    /**
     * Gets the gold category id.
     *
     * @return the gold category id
     */
    public UUID getGoldCategoryId() {
        return goldCategoryId;
    }

    /**
     * Sets the gold category id.
     *
     * @param goldCategoryId the new gold category id
     */
    public void setGoldCategoryId(UUID goldCategoryId) {
        this.goldCategoryId = goldCategoryId;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
