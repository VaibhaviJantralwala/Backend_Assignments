package Abstraction_and_Interfaces;

public class multipleInterfaces implements interface1,interface2 {

    @Override
    public void greetings() {
        System.out.println("Good Morning!");
    }

    @Override
    public void display() {
        System.out.println("Hello world");
    }
    
    public static void main(String[] args) {
        
        multipleInterfaces mi = new multipleInterfaces();
        mi.display();
        mi.greetings();
    }
}

// output :
// $ java Abstraction_and_Interfaces/multipleInterfaces
// Hello world
// Good Morning!
