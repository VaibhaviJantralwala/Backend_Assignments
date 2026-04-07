package package2;


import package1.*;

public class OutsideTest  {
    public static void main(String[] args) {
        
        BankAcc b1 = new BankAcc();

        System.out.println(b1.ownerName);
        b1.showOwner();

        b1.showAccSummary();
    }
}

// output:
// $ java -cp . package2.OutsideTest
// Vaibhavi
// Owner : Vaibhavi
// Account Summary-->
// Owner : Vaibhavi
// Bank : SBI
// Balance : 50000.0
// Pin : 8989
