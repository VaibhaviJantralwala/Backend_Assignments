package Abstraction_and_Interfaces;

public class PaypalGateway implements paymentGateway {

    @Override
    public boolean processPayment(String accId, int amount) {
        
        System.out.println("[Paypal] Processing payment of ₹"+ amount + " for account: " +accId);
        return true;
    }

    @Override
    public boolean refundPayment(String transactionId) {
        
        System.out.println("[Paypal] Refunding transaction: "+ transactionId);
        return true;
    }

    @Override
    public String checkStatus(String transactionId) {
        
        return "[Paypal] Transaction " + transactionId + " → SUCCESS";
    }
    
}
