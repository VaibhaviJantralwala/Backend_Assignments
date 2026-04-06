class Vehicle2 {
    String brand = "Toyota";
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car2 extends Vehicle2 {
    int tyres = 4;
    void showTyres() {
        System.out.println("Tyres: " + tyres);
    }
}

class ElectricCar extends Car2 {
    int batteryRange = 500;
    void showBattery() {
        System.out.println("Battery Range: " + batteryRange + "km");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.showBrand();
        ec.showTyres();
        ec.showBattery();
    }
}

// output :
// $ java MultilevelInheritance
// Brand: Toyota
// Tyres: 4
// Battery Range: 500km