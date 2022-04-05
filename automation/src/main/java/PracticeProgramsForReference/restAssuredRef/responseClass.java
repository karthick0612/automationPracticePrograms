package PracticeProgramsForReference.restAssuredRef;//package PracticeProgramsForReference.restAssuredRef;
//
//import groovy.json.JsonParser;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//public class responseClass {
//    public static void main(String[] args) throws ParseException {
//        String str = "{\n" +
//                "   \"username\" : \"my_username\",\n" +
//                "   \"password\" : \"my_password\",\n" +
//                "   \"validation-factors\" : {\n" +
//                "      \"validationFactors\" : [\n" +
//                "         {\n" +
//                "            \"name\" : \"remote_address\",\n" +
//                "            \"value\" : \"127.0.0.1\"\n" +
//                "         }\n" +
//                "      ]\n" +
//                "   }\n" +
//                "}";
//
//        JsonPath jsonPath = new JsonPath(str);
//        String str1 = jsonPath.getString("validation-factors.validationFactors.name");
//        System.out.println(str1);
//
//        JSONParser parser = new JSONParser();
//        JSONObject jsonObject = (JSONObject)parser.parse(GCLRequest.getCurrentLiteRequest);
//        JSONObject vechileDetailsObj = (JSONObject)jsonObject.get("getCurrentLite");
//        String string = (String) vechileDetailsObj.get("vin");
//        System.out.println(string);
//
//    }
//}
