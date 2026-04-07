package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    double marks;
    public Student(int id,String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class FileHandling3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // serialization
        // Student s0  = new Student(1, "A", 65.2);
        // Student s1  = new Student(2, "B", 90.8);
        // Student s2  = new Student(3, "C", 75.1);

        // try (
        //     FileOutputStream fout = new FileOutputStream("FileHandling/StudentData.txt");
        // ) {
        //     ObjectOutputStream os = new ObjectOutputStream(fout);
        //     os.writeObject(s0);
        //     os.writeObject(s1);
        //     os.writeObject(s2);
            
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // deserialization
        try {
            FileInputStream fin = new FileInputStream("FileHandling/StudentData.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
          
            Student s1 = (Student) ois.readObject();
            System.out.println(s1.id+" "+s1.name+" "+s1.marks);
            
            Student s2 = (Student) ois.readObject();
            System.out.println(s2.id+" "+s2.name+" "+s2.marks);

            Student s3 = (Student) ois.readObject();
            System.out.println(s3.id+" "+s3.name+" "+s3.marks);
        
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

// output :
// $ java -cp . FileHandling.FileHandling3
// 1 A 65.2
// 2 B 90.8
// 3 C 75.1
