import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        System.out.println("Enter Number to find out Corresponding Week Day : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter Valid Input!");
                break;
        }
        sc.close();
    }
}

// output :
// $ java SwitchCase
// Enter Number to find out Corresponding Week Day : 
// 7
// Saturday
// $ java SwitchCase
// Enter Number to find out Corresponding Week Day : 
// 2
// Monday
