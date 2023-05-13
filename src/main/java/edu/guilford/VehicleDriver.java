package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;





/**
 * JavaFX App
 */
public class VehicleDriver {
        public static void main(String[] args) {
            Car car1 = new Car("Toyota", "Supra Mk4", 1999, 2);
            Car car2 = new Car("Polestar", "One", 2021, 2);
            Car car3 = new Car("Nissan", "GTR-34", 2023, 2);
            Car car4 = new Car("Ford", "Shelby Mustang GT500", 2024, 2);
            Car car5 = new Car("Chevrolet", "C8 Corvette", 2025, 2);
    
            // create F1Car objects make model year and horsepower
            F1Car f1car1 = new F1Car("Mercedes", "W12", 2021, 1000);
            F1Car f1car2 = new F1Car("Red Bull", "RB16B", 2021, 1000);
            F1Car f1car3 = new F1Car("McLaren", "MCL35M", 2021, 1000);
            F1Car f1car4 = new F1Car("Ferrari", "SF21", 2021, 1000);
            F1Car f1car5 = new F1Car("Alpine", "A521", 2021, 1000);

            // create HyperCar objects make model year and cylinder of engine
            HyperCar hypercar1 = new HyperCar("Koenigsegg", "Jesko", 2021, 8);
            HyperCar hypercar2 = new HyperCar("Bugatti", "Chiron", 2021, 8);
            HyperCar hypercar3 = new HyperCar("Pagani", "Huayra", 2021, 8);
            HyperCar hypercar4 = new HyperCar("McLaren", "Speedtail", 2021, 8);
            HyperCar hypercar5 = new HyperCar("Aston Martin", "Valkyrie", 2021, 8);



            // use inherited method
            car1.start_engine();
            f1car1.start_engine();
            hypercar1.start_engine();

            

              // use abstract method
              for (Vehicle vehicle : Arrays.asList(car1, car2, car3, car4, car5, f1car1, f1car2, f1car3, f1car4, f1car5, hypercar1, hypercar2, hypercar3, hypercar4, hypercar5)) {
                System.out.println(vehicle.get_description());

                }
                 // use polymorphism
        Vehicle fastest = f1car1;
        System.out.println("The fastest F1Car is: " + fastest.get_description());
        fastest = hypercar1;
        System.out.println("The fastest HyperCar is: " + fastest.get_description());
        fastest = car1;
        System.out.println("The fastest car is: " + fastest.get_description());
                //another way to use polymorphism
        Vehicle[] vehicles = {car1, car2, car3, car4, car5, f1car1, f1car2, f1car3, f1car4, f1car5, hypercar1, hypercar2, hypercar3, hypercar4, hypercar5};
    
        // use Comparable interface
        Arrays.sort(vehicles);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.get_description());

        }
    }
}

        


    
    