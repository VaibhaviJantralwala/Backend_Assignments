public class staticVariable {
    int id;
    String name;
    static String clg = "GTU";

    public staticVariable(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Name : "+name+" , ID : "+id+" , College : "+clg);
    }

    public static void main(String[] args) {
        
        staticVariable sv = new staticVariable(101, "abc");
        sv.display();

        staticVariable sv1 = new staticVariable(102, "xyz");
        sv1.display();
    }
}

// output :
// $ java staticVariable
// Name : abc , ID : 101 , College : GTU
// Name : xyz , ID : 102 , College : GTU
