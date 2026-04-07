package ExceptionHandling;

class Vaibhavi extends Exception{
    public Vaibhavi(String s){
        super(s);
    }
}

public class customException{

    public customException() throws Vaibhavi{
        try{
            System.out.println(4/0);
        }
        catch(Exception e){
            throw new Vaibhavi("Custom Exception -- Vaibhavi");
        }
    }

    public static void main(String[] args) throws Vaibhavi {
        new customException();
    }
}

// output :
// $ java -cp . ExceptionHandling.customException
// Exception in thread "main" ExceptionHandling.Vaibhavi: Custom Exception -- Vaibhavi
//         at ExceptionHandling.customException.<init>(customException.java:16)
//         at ExceptionHandling.customException.main(customException.java:21)
