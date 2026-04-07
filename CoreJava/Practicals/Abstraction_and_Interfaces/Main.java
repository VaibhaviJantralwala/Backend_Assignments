package Abstraction_and_Interfaces;

public class Main {
    public static void main(String[] args) {
        
        paymentGateway pg;

        //using razorpay
        pg = new RazorpayGateway();
        pg.processPayment("USER101", 5000);
        pg.refundPayment("TRNC500123xxx");
        System.out.println(pg.checkStatus("TRNC500123xxx"));

        System.out.println("------------------");

        //using Paypal
        pg = new PaypalGateway();
        pg.processPayment("USER102", 7000);
        pg.refundPayment("TRNC756333xxx");
        System.out.println(pg.checkStatus("TRNC756333xxx"));
    }
}

// output :
// $ java Abstraction_and_Interfaces/Main
// [Razorpay] Processing payment of ?5000 for account: USER101
// [Razorpay] Refunding transaction: TRNC500123xxx
// [Razorpay] Transaction TRNC500123xxx ? SUCCESS
// ------------------
// [Paypal] Processing payment of ?7000 for account: USER102
// [Paypal] Refunding transaction: TRNC756333xxx
// [Paypal] Transaction TRNC756333xxx ? SUCCESS
