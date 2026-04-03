import java.util.Scanner;

public class maxUsingMethod {
    public static void main(String[] args) {
        
        System.out.println("Enter 3 numbers to find maximum : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum : "+max(a,b,c));

        sc.close();
    }

    private static int max(int a, int b, int c) {
        if( a > b && a > c ) return a;
        else if( b > a && b > c) return b;
        else return c;
    }
}

// output :
// $ java maxUsingMethod
// Enter 3 numbers to find maximum : 
// 23
// 45
// 99
// Maximum : 99
