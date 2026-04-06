import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if( num % 2 == 0 ){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
}

// output : 
// $ java EvenOdd
// 25
// Odd Number
// $ java EvenOdd
// 24
// Even Number