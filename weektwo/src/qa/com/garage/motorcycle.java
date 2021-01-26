package qa.com.garage;

public class motorcycle extends vehicle {
    String handlebarcolour;

    public motorcycle(int wheels, int engine, String model, int fuelCapacity, String handlebarcolour) {
        super(wheels, engine, model, fuelCapacity);
        this.handlebarcolour = handlebarcolour;
    }

    public String getHandlebarcolour() {
        return handlebarcolour;
    }

    public void setHandlebarcolour(String handlebarcolour) {
        this.handlebarcolour = handlebarcolour;
    }

    @Override
    public void start() {
        super.start();
    }
}
