public class Calculator {
    public static void main(String[] args) {

        // Calculator using arithmatic and relational operators 

        float n1 = 5;
        float n2 = 9;
       
        System.out.println("Addition : "+(n1+n2));
        System.out.println("Subtraction : "+(n2-n1));
        System.out.println("Multiplication : "+(n1*n2));
        System.out.println("Division : "+(n2/n1));
        System.out.println("Modulo : "+(n2%n1));
        
         // Relational
        System.out.println("n1 == n2 : " + (n1 == n2));
        System.out.println("n1 != n2 : " + (n1 != n2));
        System.out.println("n1 > n2 : " + (n1 > n2));
        System.out.println("n1 < n2 : " + (n1 < n2));
        System.out.println("n1 >= n2 : " + (n1 >= n2));
        System.out.println("n1 <= n2 : " + (n1 <= n2));
    
    }
}

// output :
// Addition : 14.0
// Subtraction : 4.0
// Multiplication : 45.0
// Division : 1.8
// Modulo : 4.0
// n1 == n2 : false
// n1 != n2 : true
// n1 > n2 : false
// n1 < n2 : true
// n1 >= n2 : false
// n1 <= n2 : true
