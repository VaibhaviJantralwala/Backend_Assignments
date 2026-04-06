package Abstraction_and_Interfaces;

public class multipleInterfaces implements interface1,interface2     {
    public static void main(String[] args) {
     
        multipleInterfaces mi = new multipleInterfaces();
        mi.Greetings();
        mi.display();
    }

    public void Greetings() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'Greetings'");
        System.out.println("Good Morning !");
    }

    public void display() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
        System.out.println("Hello World !");
    }
}

// output :
// $ java multipleInterfaces
// Good Morning !
// Hello World !
