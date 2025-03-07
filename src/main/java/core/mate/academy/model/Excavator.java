package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int sizeOfBucket;

    public Excavator() {
    }

    public Excavator(int sizeOfBucket) {
        this.sizeOfBucket = sizeOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
