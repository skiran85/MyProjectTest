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
/**
 *
 * @author kiransoma
 */
public class RecommendationTABNames
{
    private String por;
    private String eng;

    public String getPor() 
    {
        return por;
    }

    public void setPor(String por) 
    {
        this.por = por;
    }

    public String getEng() 
    {
        return eng;
    }

    public void setEng(String eng) 
    {
        this.eng = eng;
    }
    
    @Override
    public String toString()
    {
        return "[por = "+por+", eng = "+eng+"]";
    }    
}
