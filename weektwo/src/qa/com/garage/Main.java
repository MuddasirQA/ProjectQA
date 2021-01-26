package qa.com.garage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        car carA = new car(4, 1, "tesla", 100, 4, false);

        motorcycle motorcycleB = new motorcycle(2, 1, "porsche", 10, "red");
        truck truckC = new truck(10,2,"ford",1000,1000,true);

Garage x = new Garage();
x.addVehicletoList(truckC);
x.addVehicletoList(carA);
x.calculateBill();
x.displayVehicles();








    }
}
