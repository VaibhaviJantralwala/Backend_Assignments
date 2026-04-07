package Abstraction_and_Interfaces;

public interface paymentGateway {
    
    boolean processPayment(String accId,int amount);

    boolean refundPayment(String transactionId);

    String checkStatus(String transactionId);
}
