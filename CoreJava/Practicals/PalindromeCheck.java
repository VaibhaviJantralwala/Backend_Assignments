import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(ispalindrome(s)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }

    private static boolean ispalindrome(String s) {
        String rev = "";
        for(int i=s.length()-1 ; i>=0 ; i--){
            char c = s.charAt(i);
            rev += c;
        }
        if( !rev.equals(s)){
            return false;
        }
        return true;
    }
}

// output :
// $ java PalindromeCheck
// abc
// Not a palindrome
// $ java PalindromeCheck
// malayalam
// Its a palindrome
