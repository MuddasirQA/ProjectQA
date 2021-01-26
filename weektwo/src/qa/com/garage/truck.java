package qa.com.garage;

public class truck extends vehicle {
    int capacity;
    boolean isMonster;


    public truck(int wheels, int engine, String model, int fuelCapacity, int capacity, boolean isMonster) {
        super(wheels, engine, model, fuelCapacity);
        this.capacity = capacity;
        this.isMonster = isMonster;

    }

    @Override
    public void start() {
        super.start();
        System.out.println("engine warming up... please wait");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isMonster() {
        return isMonster;
    }

    public void setMonster(boolean monster) {
        isMonster = monster;
    }
}
