/*
 * Copyright (c) Multichoice Technical Operations. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Multichoice Technical Operations. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you
 * entered into with Multichoice Technical Operations.
 *
 * MULTICHOICE MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. MULTICHOICE
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package com.mca.recommendationjsonparser.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiransoma
 */
public class RecommendationTABS
{
    private RecommendationTABNames tabNames;
    private RecommendationTABConfig config;
    private List<RecommendationEditorialList> editorialList = new ArrayList<RecommendationEditorialList>();

    public RecommendationTABNames getTABnames() 
    {
        return tabNames;
    }

    public void setTABnames(RecommendationTABNames tabNames) 
    {
        this.tabNames = tabNames;
    }

    public RecommendationTABConfig getConfig() 
    {
        return config;
    }

    public void setConfig(RecommendationTABConfig config) 
    {
        this.config = config;
    }

    public List<RecommendationEditorialList> getEditorialList()
    {
        return editorialList;
    }

    public void setEditorialList(List<RecommendationEditorialList> editorialList) 
    {
        this.editorialList = editorialList;
    }
    
    @Override
    public String toString()
    {
        return "[tabNames = "+tabNames+", config = "+config+", editorialList = "+editorialList+"]";
    }
    
}
