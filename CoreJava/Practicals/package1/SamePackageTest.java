package package1;

public class SamePackageTest {
    
    public static void main(String[] args) {
        
        BankAcc ba = new BankAcc();
        
        // public 
        System.out.println(ba.ownerName);
        ba.showOwner();

        // protected
        System.out.println(ba.balance);
        ba.showBalance();

        // default
        System.out.println(ba.bankName);
        ba.showBankName();

        ba.showAccSummary();
    }
}

// // output :
// $ java -cp . package1.SamePackageTest  
// Vaibhavi
// Owner : Vaibhavi
// 50000.0
// Balance : 50000.0
// SBI
// Bank : SBI
// Account Summary-->
// Owner : Vaibhavi
// Bank : SBI
// Balance : 50000.0
// Pin : 8989