package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean isNew;

    public Truck() {
    }

    public Truck(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
