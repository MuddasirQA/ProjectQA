package qa.com.garage;

public class vehicle {
    public int wheels;
    public int engine;
    public String model;
    public int fuelCapacity;

 public vehicle(){

 }

    public vehicle(int wheels, int engine, String model, int fuelCapacity) {
        this.wheels = wheels;
        this.engine = engine;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }
    public void start(){
        System.out.println("engine starting...");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
