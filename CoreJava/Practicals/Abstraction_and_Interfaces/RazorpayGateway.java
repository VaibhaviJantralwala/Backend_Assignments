package Abstraction_and_Interfaces;

public class RazorpayGateway implements paymentGateway {

    @Override
    public boolean processPayment(String accId, int amount) {
        System.out.println("[Razorpay] Processing payment of ₹"+ amount + " for account: " +accId);
        return true;
    }

    @Override
    public boolean refundPayment(String transactionId) {
        
        System.out.println("[Razorpay] Refunding transaction: "+ transactionId);
        return true;
    }

    @Override
    public String checkStatus(String transactionId) {
        return "[Razorpay] Transaction " + transactionId + " → SUCCESS";
    }
    
}
