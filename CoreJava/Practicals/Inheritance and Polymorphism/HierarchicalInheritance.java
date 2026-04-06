class Vehicle1{
    int speed = 120;
    String brand = "Toyota";

    public void display(){
        System.out.println("Speed : "+speed);
        System.out.println("Brand : "+brand);
    }
}

class Bike1 extends Vehicle1{
    int tyres = 2;
    String fuel = "Petrol";

    public void displayBike(){
        display();
        System.out.println("Tyres : "+tyres);
        System.out.println("Fuel : "+fuel);
    }
}

class Car1 extends Vehicle1{
    int tyres = 4;
    String fuel = "CNG";
    boolean hasAC = true;

    public void displayCar(){
        display();
        System.out.println("Tyres : "+tyres);
        System.out.println("Fuel : "+fuel);
        System.out.println("Has AC ? "+ ((hasAC)? "Yes" : "No"));
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        
        Car1 c1 = new Car1();
        Bike1 b1 = new Bike1();

        System.out.println("---Car---");
        c1.displayCar();

        System.out.println("---Bike---");
        b1.displayBike();

    }
}

// output :
// $ java HierarchicalInheritance
// ---Car---
// Speed : 120
// Brand : Toyota
// Tyres : 4
// Fuel : CNG
// Has AC ? Yes
// ---Bike---
// Speed : 120
// Brand : Toyota
// Tyres : 2
// Fuel : Petrol
