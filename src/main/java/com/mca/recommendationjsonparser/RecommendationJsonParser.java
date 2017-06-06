package com.mca.recommendationjsonparser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.mca.mwapi.vod.naming.RecommendationJsonFieldNamingStrategy;
import com.mca.recommendationjsonparser.metadata.Recommendation;
//import com.mca.recommendationjsonparser.naming.RecommendationJsonFieldNamingStrategy;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;

/**
 * Hello world!
 *
 */
public class RecommendationJsonParser 
{
    private static Recommendation recommendation;
    private static final String JSON_FILE_PATH = "/home/kiransoma/developement/Recom_ZAF.json";
    
    private static void parseJsonToJavaClass()
    {
        Gson gson = new GsonBuilder().setFieldNamingStrategy(new RecommendationJsonFieldNamingStrategy()).create();
        FileReader fr = null;        
        try 
        {
            fr = new FileReader(JSON_FILE_PATH);
        } 
        catch (FileNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(RecommendationJsonParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(fr == null)
        {
            recommendation = null;
            return;
        }

        recommendation = gson.fromJson(new JsonReader(fr), Recommendation.class);

        if(recommendation != null)
        {
            System.out.println("recommendation JSON parser is success :: create date time ::" + recommendation.getRecommendations().getCreatedDateTime());
            System.out.println("recommendation to string ::" + recommendation.toString());
        }
        else
        {
            System.out.println("recommendation JSON parser is failure ");
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        parseJsonToJavaClass();
    }
}
