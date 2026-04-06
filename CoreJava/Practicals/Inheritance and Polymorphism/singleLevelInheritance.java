class Vehicle{
    String brand = "Toyota";
    double speed = 120;
    String fuelType = "Petrol";

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle{
    int tyres = 4;
    boolean hasAC = true;
    void displayCar() {
        display();
        System.out.println("Tyres " + tyres);
        System.out.println("Has AC: " + hasAC);
    }
}


public class singleLevelInheritance {
    public static void main(String[] args) {
        
        Car c = new Car();
        c.displayCar();

    }
}

// output :
// $ java singleLevelInheritance
// Brand: Toyota
// Speed: 120.0
// Fuel Type: Petrol
// Tyres 4
// Has AC: true