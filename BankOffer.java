public class BankOffer{
    public static void main(String[] args){

        SavingsAccount mySavings = new SavingsAccount("Smart", 500.0);

        InterestCalculator calculator = new BankInterest();
        Insurance insurance = new BankInsurance();

        //Display
        System.out.println("Interest of " + mySavings.getBankName() + " is " +
                            mySavings.accept(calculator,mySavings.getBalance()));
        System.out.println("Insurance of " + mySavings.getBankName() + " is " +
                            mySavings.accept(insurance,mySavings.getBalance()));

       //Seabank
       mySavings.setBankName("Globe");
       System.out.println("\nInterest of " + mySavings.getBankName() + " is " +
                           mySavings.accept(calculator,mySavings.getBalance()));
       System.out.println("Insurance of " + mySavings.getBankName() + " is " +
       mySavings.accept(insurance,mySavings.getBalance()));

       //GoTyme
       mySavings.setBankName("Ditto");
       System.out.println("\nInterest of " + mySavings.getBankName() + " is " +
                           mySavings.accept(calculator,mySavings.getBalance()));
       System.out.println("Insurance of " + mySavings.getBankName() + " is " +
       mySavings.accept(insurance,mySavings.getBalance()));
    }
}
