package PracticeProgramsForReference.StringRelatedPrograms;

import java.util.*;

public class CalculateTollAmount {
    public static void main(String[] args){
        calculateAmount calculateAmount = new calculateAmount();
        Integer fareAmount = calculateAmount.calculateFare("Bus","B");
        System.out.println(fareAmount);
    }
}

class  calculateAmount{
    Integer calculateFare(String vechileType, String destination){
        List<String> vehicleNames1 = new ArrayList<>();
        vehicleNames1.add("Bus");
        vehicleNames1.add("Car");
        List<String> vehicleNames2 = new ArrayList<>();
        vehicleNames2.add("Lorry");
        vehicleNames2.add("Jeep");

        Map<String,Integer> tollfareAmount = new HashMap<>();
        Map<String,Map<String,Integer>> tollfareAmountMap = new HashMap<>();
        tollfareAmount.put("Bus",40);
        tollfareAmountMap.put("T1Single",tollfareAmount);

        Map<String,String> destinationMap = new HashMap<>();
        destinationMap.put("A,B","T1Single");
        destinationMap.put("B,C","T2Single");
        destinationMap.put("D,E","T3Single");

        int fareAmount = 0;
        if(vehicleNames1.contains(vechileType) || vehicleNames2.contains(vechileType) ){
            if(destinationMap.containsKey(destination)){
                String tollInfo = destinationMap.get(destination);
                Map<String,Integer> totalAmountMap = tollfareAmountMap.get(tollInfo);
                fareAmount = tollfareAmount.get(vechileType);
            }
        }
        return fareAmount;
    }
}
