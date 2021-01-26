package qa.com.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage extends vehicle{
    @Override
    public String toString() {
        return "Garage{" +
                "carA=" + carA +
                ", motorcycleB=" + motorcycleB +
                ", truckC=" + truckC +
                ", garageofvehicles=" + garageofvehicles +
                '}';
    }

    car carA = new car(4, 1, "tesla", 100, 4, false);

    motorcycle motorcycleB = new motorcycle(2, 1, "porsche", 10, "red");
    truck truckC = new truck(10,2,"ford",1000,1000,true);

    List<vehicle> garageofvehicles = new ArrayList<>();

    public void removeVehiclebyModel(){
        for(vehicle i: garageofvehicles){
            if(garageofvehicles.equals("porsche")){
                garageofvehicles.remove(i);

            }
        }
    }
    public void addVehicletoList(vehicle x){
        garageofvehicles.add(x);
    }
    public void removeVehicletoList(vehicle y){
        garageofvehicles.remove(y);
    }
    public void calculateBill(){
        for(vehicle i: garageofvehicles){
            if(i instanceof car){
                int total = (i.getWheels()*200) + 1500;
                System.out.println("total cost of your car was  " + total);

            }
            else if(i instanceof motorcycle){
                int total = (fuelCapacity * 5);
                System.out.println("total for your bike was " + total);
            }
            else if(i instanceof truck){
                int total = ((truck) i).getCapacity()*100;
                System.out.println("your total for the truck was " + total);
            }

        }
    }
    public void displayVehicles(){
    for(vehicle g: garageofvehicles);
        System.out.println(toString());


    }


}
