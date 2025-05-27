class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

class Exercise17_CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;
        car1.displayDetails();
    }
}
