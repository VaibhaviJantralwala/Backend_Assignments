public class Student {
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void display(){
        System.out.println(name+" , "+age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(20,"Student1");
        s1.display();
        Student s2 = new Student(21,"Student2");
        s2.display();
    }
}

// output :
// $ java Student
// Student1 , 20
// Student2 , 21