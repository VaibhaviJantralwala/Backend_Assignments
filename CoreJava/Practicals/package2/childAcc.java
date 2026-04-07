package package2;


import package1.BankAcc;

public class childAcc extends BankAcc {

    public void displayInfo(){

        System.out.println("Owner : "+ownerName);
        showOwner();

        System.out.println("Balance : " + balance);
        showBalance();
    }
    
}
