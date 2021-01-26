package qa.com.garage;

public class car extends vehicle {
    public int doors;
    public boolean turbo;

    public car(int wheels, int engine, String model, int fuelCapacity, int doors, boolean turbo) {
        super(wheels, engine, model, fuelCapacity);
        this.doors = doors;
        this.turbo = turbo;

    }

    @Override
    public void start() {

        System.out.println("Vroooom");
    }
    public void unlock(){
        System.out.println("Doors have been unlocked and are opening...");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
