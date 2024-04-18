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
    public double accept(InterestCalculator calculator, double money) {
        this.balance = money;
        return calculator.computeInterest(bankName, balance);
    }
   
    @Override
    public double accept(Insurance insurance, double money) {
        this.balance = money;
        return insurance.computeInsurance(bankName, balance);
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }
   
}
