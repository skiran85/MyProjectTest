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
public class RecommendationEditorialList
{
    private List<RecommendationListItem> listItem = new ArrayList<RecommendationListItem>();
    private RecommendationListNames names;
    
    public List<RecommendationListItem> getListItem() 
    {
        return listItem;
    }

    public void setListItem(List<RecommendationListItem> listItem)
    {
        this.listItem = listItem;
    }

    public RecommendationListNames getNames() 
    {
        return names;
    }

    public void setNames(RecommendationListNames names) 
    {
        this.names = names;
    }
    
    @Override
    public String toString()
    {
        return "[listItem = "+listItem+", names = "+names+"]";
    }    
}
