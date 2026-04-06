public class StringCompare {
    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "world";

        // equals() - true/false only
        System.out.println("equals() :");
        System.out.println("s1 equals s2 : " + s1.equals(s2));
        System.out.println("s1 equals s3 : " + s1.equals(s3));

        // compareTo() - returns 0, positive or negative
        System.out.println("\ncompareTo() :");
        System.out.println("s1 compareTo s2 : " + s1.compareTo(s2)); // 0 = equal
        System.out.println("s1 compareTo s3 : " + s1.compareTo(s3)); // negative = s1 comes first
        System.out.println("s3 compareTo s1 : " + s3.compareTo(s1)); // positive = s3 comes after

    }
}

// output : 
// $ java StringCompare
// equals() :
// s1 equals s2 : true
// s1 equals s3 : false

// compareTo() :
// s1 compareTo s2 : 0
// s1 compareTo s3 : -15
// s3 compareTo s1 : 15