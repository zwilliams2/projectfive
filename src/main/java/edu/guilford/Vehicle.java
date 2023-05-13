package edu.guilford;

    abstract class Vehicle implements Comparable<Vehicle> {
        protected String make;
        protected String model;
        protected String color;
        protected int year; 
        protected int num_wheels;
        protected int num_doors;
    
    //createa constructor
        public Vehicle(String make, String model, int year, int num_wheels, int num_doors) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.num_wheels = num_wheels;
            this.num_doors = num_doors;

}


//create abstract method
    public abstract String get_description();

    public void start_engine() {
        System.out.println("the Engine is starting.");
    }

    public int compareTo(Vehicle other) {
        return this.get_num_wheels() - other.get_num_wheels();
    }

    protected abstract int get_num_wheels();

}
//create subclasses for car
class Car extends Vehicle {
    private int num_doors;

    public Car(String make, String model, int year, int num_doors) {
        super(make, model, year, num_doors, num_doors);
        this.num_doors = num_doors;
    }

    public String get_description() {
        return String.format("A %d %s %s with %d doors", this.year, this.make, this.model, this.num_doors);
    }

    protected int get_num_wheels() {
        return 4;
    }

    public void start_engine() {
        System.out.println("The Car is starting.");
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    public void park() {
        System.out.println("The car is parking.");
    }
}
// ceate a subclass for F1Car
class F1Car extends Vehicle {
    private int horsepower;

    public F1Car(String make, String model, int year, int horsepower) {
        super(make, model, year, horsepower, horsepower);
        this.horsepower = horsepower;
    }

    public String get_description() {
        return String.format("A %d %s %s with %d horsepower", this.year, this.make, this.model, this.horsepower);
    }

    protected int get_num_wheels() {
        return 4;
    }

    public void start_engine() {
        System.out.println("The F1Car is starting.");
    }


    public void drive() {
        System.out.println("The F1Car is driving.");
    }


    public void pit_stop() {
        System.out.println("The F1Car is making a pit-stop.");
    }

}
// create a subclass for HyperCar
class HyperCar extends Vehicle {
    private int motor;

    public HyperCar(String make, String model, int year, int motor) {
        super(make, model, year, motor, motor);
        this.motor = motor;
    }


    public String get_description() {
        return String.format("A %d %s %s with %d motor", this.year, this.make, this.model, this.motor);
    }


    protected int get_num_wheels() {
        return 4;
    }


    public void start_engine() {
        System.out.println("The HyperCar is starting.");
    }


    public void drive() {
        System.out.println("The HyperCar is driving.");
    }


    public void park() {
        System.out.println("The HyperCar is parking.");
    }

}




    

