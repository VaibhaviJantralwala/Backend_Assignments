class parent{
    public parent(){
        System.out.println("parent Constructor");
    }

    public void display(){
        System.out.println("Method -> parent class");
    }
}

class child extends parent{
    public child(){
        super();
        System.out.println("Child constructor");
    }

    public void display(){
        super.display();
        System.out.println("Method -> child class");
    }
}

public class superKeyword {
    public static void main(String[] args) {

        child c = new child();
        c.display();
    }
}

// output :
// $ java superKeyword
// parent Constructor
// Child constructor
// Method -> parent class
// Method -> child class

