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
     public void setDateAllowance(integer setdateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public void setUnliCallText(double unliCallText) {
        this.unliCallText = unliCallText;
    }

    public String getTelecoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }
   

    public String getDateAllowance() {
        return dateAllowance;
    }

    public double getUnliCallText() {
        return unliCallText;
    }
   
}
