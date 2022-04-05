package PracticeProgramsForReference.restAssuredRef;//package PracticeProgramsForReference.restAssuredRef;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//import java.util.*;
//
//public class RestAssuredExmaple {
//    public static void main(String[] args){
//        try{
//            Map<String, String> headers = new HashMap<>();
//            headers.put("Content-Type","Application/json");
//            Response response = RestAssured.given()
//                    .headers(headers)
//                    .body(GCLRequest.getCurrentLiteRequest)
//                    .post("https://gvms-gcl-api-edc1-qa.apps.pp01i.edc1.cf.ford.com/api/moduleinfo/v1/getCurrentLite");
//
//            JSONParser parser = new JSONParser();
//            JSONObject jsonObject = (JSONObject)parser.parse(response.asString());
//            JSONObject GCLResponseObj = (JSONObject)jsonObject.get("getCurrentLiteResponse");
//            JSONArray nodeDetailsArray = (JSONArray)GCLResponseObj.get("nodeDetails");
//            System.out.println(nodeDetailsArray.size());
//            JsonPath jsonPathvalue = new JsonPath(nodeDetailsArray.toJSONString());
//
////            org.json.JSONObject gclResponseObj = (org.json.JSONObject) parser.parse(response.asString());
//            org.json.JSONObject gclResponseObj = new org.json.JSONObject(response.asString());
//            System.out.println(gclResponseObj.get("getCurrentLiteResponse"));
//            org.json.JSONArray array = gclResponseObj.getJSONArray("getCurrentLiteResponse");
//            System.out.println(array.getString(1));
//
//            Iterator<JSONObject> iterator = nodeDetailsArray.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
////                JSONObject jsonObject1 = (JSONObject)iterator.next();
////                System.out.println(jsonObject1.get("nodeAddress"));
//            }
//
////            Iterator i = arrayRegions.iterator();
////            while(i.hasNext()) {
////                supportedCountries.add((String)i.next());
////            }
//
////            JSONObject jObj = (JSONObject) numbers.get(0);
////            System.out.println(jObj.get("nodeAddress"));
//
//
////            JSONParser parser = new JSONParser();
////            JSONObject jsonObject = (JSONObject)parser.parse(GCLRequest.getCurrentLiteRequest);
////            JSONObject vechileDetailsObj = (JSONObject)jsonObject.get("getCurrentLiteResponse");
////            String string = (String) vechileDetailsObj.get("vin");
////            System.out.println(string);
//
//            JsonPath jsonPath = response.jsonPath();
//            Map<String,String> responseMap = response.jsonPath().getMap("getCurrentLiteResponse");
//            Map<String,String> responseMap1 = response.jsonPath().get("getCurrentLiteResponse");
//
//            System.out.println(responseMap.size());
//
//            String[] node = jsonPath.getString("getCurrentLiteResponse.nodeDetails.didInfoDetails.didValue").split(",");
//            System.out.println(responseMap.get(""));
//
//
//            System.out.println(node.length);
//            System.out.println(Arrays.toString(node));
//            System.out.println(response.asString());
//
//            //JSONObject getCurrentLiteResponse = (JSONObject) response.getBody().prettyPrint();
////            System.out.println(getCurrentLiteResponse.get("nodeDetails"));
////            JSONObject nodeDetailsObj = (JSONObject) getCurrentLiteResponse.get("vehicleDetails");
////            System.out.println(nodeDetailsObj.toString());
//
//            ObjectMapper objectMapper = new ObjectMapper();
//           // JSONObject jsonObject = new JSONObject(response.getBody().asString());
//
//            System.out.println(response.asString());
//
//        }catch (Exception e){
//            e.getMessage();
//            e.printStackTrace();
//        }
//    }
//}
