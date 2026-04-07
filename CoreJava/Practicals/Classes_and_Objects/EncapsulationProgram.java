package Classes_and_Objects;

public class EncapsulationProgram {
    private int id;
    private String name;

    public void set(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void get(){
        System.out.println("Name : "+name+" ID : "+id);
    }
    public static void main(String[] args) {
        
        EncapsulationProgram ep = new EncapsulationProgram();
        ep.set(11, "Vaibhavi");
        ep.get();

        EncapsulationProgram ep1 = new EncapsulationProgram();
        ep1.set(12, "abc");
        ep1.get();
    }
}

// output :
// $ java EncapsulationProgram
// Name : Vaibhavi ID : 11
// Name : abc ID : 12
