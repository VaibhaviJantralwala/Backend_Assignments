abstract class Parent1{
    abstract void display();
}

class child1 extends Parent1{

    @Override
    void display() {
        System.out.println("Method");
    }
    
}

public class abstractClass {
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.display();
    }
}

// output :
// $ java abstractClass
// Method
