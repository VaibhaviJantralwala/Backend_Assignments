package ExceptionHandling;

public class multiplecatchblocks {

    void div(){
        try{
            System.out.println(5/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Arithmatic Exception Example");
        }
    }

    public static void main(String[] args) {
        new multiplecatchblocks().div();
    }
}

// output :
// $ java -cp . ExceptionHandling.multiplecatchblocks
// java.lang.ArithmeticException: / by zero
// Arithmatic Exception Example
