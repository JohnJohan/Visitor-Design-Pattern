public class Telco implements TelcoSubsription{
    private String telcoName;
    private double promoPrice;
    private integer dateAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
    }
   
    @Override
    public String accept(UsagePromo promo, double money) {
        this.promoPrice = money;
        return promo.UsagePromo(telcoName, promoPrice);
    }
   
    @Override
    public String accept(UnliCallsTextOffer offer, double money) {
        this.promoPrice = money;
        return offer.UnliCallsTextOffer(telcoName, promoPrice);
    }

    public void setTelecoName(String setTelecoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getTelecoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }
   
}
