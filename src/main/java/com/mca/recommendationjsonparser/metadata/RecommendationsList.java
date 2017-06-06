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
public class RecommendationsList 
{
    private String createdDateTime;
    private List<RecommendationTABS> tabs = new ArrayList<RecommendationTABS>();


    public String getCreatedDateTime() 
    {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) 
    {
        this.createdDateTime = createdDateTime;
    }

    public List<RecommendationTABS> getTABS() 
    {
        return tabs;
    }

    public void setTABS(List<RecommendationTABS> tabs) 
    {
        this.tabs = tabs;
    }
    
    @Override
    public String toString()
    {
        return "[createdDateTime = "+createdDateTime+", tabs = "+tabs+"]";
    }
    
}
