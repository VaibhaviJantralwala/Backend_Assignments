public class ConstructorProgram{
    int age;
    String name;

    public ConstructorProgram(){
        System.out.println("Default Constructor");
    }

    public ConstructorProgram(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Age : "+age+" Name : "+name);
    }

    public static void main(String[] args) {
        ConstructorProgram cp = new ConstructorProgram();

        ConstructorProgram cp1 = new ConstructorProgram(22, "abc");
    }
}

// output :
// $ java ConstructorProgram
// Default Constructor
// Age : 22 Name : abc