package ExceptionHandling;

public class tryCatchFinally {

    public tryCatchFinally(){
        int a = 9 ; 
        int b = 0;

        try{
            System.out.println(a / b);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hello World");
        }

    }

    public static void main(String[] args) {
        
        // tryCatchFinally tcf = new tryCatchFinally();
    }
}

// // output :
// $ java -cp .  ExceptionHandling.tryCatchFinally
// java.lang.ArithmeticException: / by zero
// Hello World
