class A{
    public A(){
        System.out.println("Parent class constructor");
    }
    public void display(){
        System.out.println("A");
    }

}

class B extends A{
    public B(){
        
        System.out.println("Child class constructor");
    }
    public void display(){
        System.out.println("B");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

// output :
// $ java MethodOverriding
// Parent class constructor
// Child class constructor
// B
