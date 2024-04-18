import java.util.*;
public class UnliCallTextPackage implements UnliCallsTextOffer{

    private static Map<String, Double> insuranceMap = new HashMap<>();

    static {
        insuranceMap.put("Smart", 15.0);
        insuranceMap.put("Globe", 10.0);
        insuranceMap.put("Ditto", 8.0);
    }

    @Override
    public String showUnliCallsTextOffers(String telcoName, double money) {
        double insuranceValue = insuranceMap.getOrDefault(telcoName, 0.0);

        if (insuranceValue == 0.0) {
            // Handle the case where insurance value is zero (e.g., GoTyme)
            return 0.0;
        }
    
         
        if (money >= 400.0) {
            return money * (money / insuranceValue);
        } else {
            return 0.0;
        }  
    }

}
