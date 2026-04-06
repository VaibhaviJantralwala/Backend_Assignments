class PaymentMethods{

    double amount;

    public PaymentMethods(double amount){
        System.out.println("Payment through Cash. Amount : "+amount);
    }

    public PaymentMethods(double amount,String upiId){
        System.out.println("Payment through UPI . Amount : "+amount+" UPI ID : "+upiId);
    }

    public PaymentMethods(double amount,int cardNum){
        System.out.println("Payment through card. Amount : "+amount+" Card-Number : "+cardNum);
    }
}

public class ConstructorOverLoading {
    public static void main(String[] args) {
        
        PaymentMethods p = new PaymentMethods(1000);
        PaymentMethods p1 = new PaymentMethods(5000,"xyc@bank.com");
        PaymentMethods p2 = new PaymentMethods(7000,45689741);
    }
}

// output :
// $ java ConstructorOverLoading
// Payment through Cash. Amount : 1000.0
// Payment through UPI . Amount : 5000.0 UPI ID : xyc@bank.com
// Payment through card. Amount : 7000.0 Card-Number : 45689741