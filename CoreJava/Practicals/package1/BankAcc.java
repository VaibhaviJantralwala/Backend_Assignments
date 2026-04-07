package package1;


public class BankAcc {
    
    public String ownerName = "Vaibhavi";   // anyone can access
    protected double balance = 50000.0;     // within subclass only
    String bankName = "SBI";                // within same package
    private String pin = "8989";            // within same class only 

    // public method -> accessible everywhere
    public void showOwner(){
        System.out.println("Owner : "+ownerName);
    }

    // protected method
    protected void showBalance(){
        System.out.println("Balance : "+balance);
    }

    // default method
    void showBankName(){
        System.out.println("Bank : "+bankName);
    }

    // private method
    private void showPin(){
        System.out.println("Pin : "+pin);
    }

    // public method that internally uses private method
    public void showAccSummary(){
        System.out.println("Account Summary-->");
        showOwner();
        showBankName();
        showBalance();
        showPin();
    }
}
