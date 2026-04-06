package Methods;
public class methodOverloading {

    public void display(int a){
        System.out.println(a);
    }

    public void display(float f){
        System.out.println(f);
    }

    public void display(char c){
        System.out.println(c);
    }

    public void display(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        
        methodOverloading mo = new methodOverloading();
        mo.display("Vaibhavi");
        mo.display("a");
        mo.display(77.12f);
        mo.display(0);
    }
}

// output :
// $ java methodOverloading
// Vaibhavi
// a
// 77.12
// 0

