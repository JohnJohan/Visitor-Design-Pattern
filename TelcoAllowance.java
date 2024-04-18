import java.util.*;
public class TelcoAllowance implements UsagePromo{

    private static Map<String, Double> interestMap = new HashMap<>();
   
    static{
        interestMap.put("Smart", 500);
        interestMap.put("Globe", 450);
        interestMap.put("Ditto", 400);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return interestMap.get(telcoName) * money;
    }
   
}
