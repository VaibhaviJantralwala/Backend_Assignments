public class TypeCasting {
    public static void main(String[] args) {
        
        // Implicit typecasting
        int a = 100;
        long l = a;
        float f = l;
        System.out.println("Int to long -> "+l);
        System.out.println("Long to Float -> "+f);

        //explicit typecasting
        float e = 10.56f;
        // int s = f; -> will give error
        int s = (int) e; 
        System.out.println("FLoat to int -> "+s);
    }
}

// output :
// Int to long -> 100
// Long to Float -> 100.0
// FLoat to int -> 10