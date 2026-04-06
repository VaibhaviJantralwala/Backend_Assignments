import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        System.out.println("Enter range till you want to print Fibonacci Series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=0 ; i<n-2 ; i++){
            int sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
        }
        sc.close();
    }
}

// output : 
// $ java Fibonacci
// Enter range till you want to print Fibonacci Series : 
// 5
// 0 1 1 2 3
// $ java Fibonacci
// Enter range till you want to print Fibonacci Series : 
// 10
// 0 1 1 2 3 5 8 13 21 34 
