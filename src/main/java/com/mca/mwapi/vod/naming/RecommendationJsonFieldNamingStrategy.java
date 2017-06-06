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



package com.mca.mwapi.vod.naming;
import com.google.gson.FieldNamingStrategy;
import java.lang.reflect.Field;

/**
 *
 * @author Kiran Soma
 */
public class RecommendationJsonFieldNamingStrategy implements FieldNamingStrategy
{

    @Override
    public String translateName(Field field) 
    {
        String value = field.getName();
//        if ("tabs".equals(field.getName()))
//        {
//            value = "tabs";
//        }
//        else if ("config".equals(field.getName()))
//        {
//            value = "config";
//        }
//        else if ("tabNames".equals(field.getName()))
//        {
//            value = "tabName";
//        }
        return value;
    }
}
