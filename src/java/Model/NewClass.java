/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author nuttanan
 */
public class NewClass {
    public static void main(String[] args) {
        try{
       String data = "{\"id\": \"54217000\", \"label\": \"1234\"}";
       // {\"id\": \"FindAgain\", \"label\": \"Find Again\"}
       //[0,{\"stdid\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]
        JSONParser parser = new JSONParser();
         Object obj = parser.parse(data);
         //JSONArray array = (JSONArray)obj;
         System.out.println("The 2nd element of array");
         //System.out.println(array.get(1));
         System.out.println();
        
       //JSONObject newJSON = (JSONObject)array.get(1);
         JSONObject newJSON = (JSONObject)obj;
         int a =Integer.parseInt(newJSON.get("id").toString());
            System.out.println(a);
            String last = obj.toString();
           System.out.println(last);
           
            System.out.println("------------------------------------");
            String yo = "54217023/yach/hawdy/4";
            int a1 = yo.indexOf("/",1);
            int a2 = yo.indexOf("/",a1+1);
            int a3 = yo.indexOf("/",a2+1);
            System.out.println(a1+"-"+a2+"-"+a3);
            System.out.println(yo.substring(0, a1));
            System.out.println(yo.substring(a1+1, a2));
            System.out.println(yo.substring(a2+1, a3));
            System.out.println(yo.substring(a3+1));
        }catch(Exception e){
            System.out.println("");
    }
    }
}
