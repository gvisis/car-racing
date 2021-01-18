package carracing;


public class Car {
    protected String name;
    protected int maxSpeed;
    protected int distance;
    protected int currentSpeed;

    // Constructor
    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.distance = 0;
        this.currentSpeed = 0;
    }

    // Getters.
    public String getName() {
        return this.name;
    }

    public int getDistance() {
        return this.distance;
    }

    // Methods
    public void accelerate() {
        //  accelerates from 1 to 10
        this.currentSpeed += (int) (Math.random() * 10 + 1);

        if (this.currentSpeed > this.maxSpeed) {
            this.currentSpeed = this.maxSpeed;
        }
//        System.out.println("accelerate: " + this.currentSpeed);
    }

    public void decelerate() {
        // Decelerates from 1 to 5
        this.currentSpeed -= (int) (Math.random() * 5 + 1);
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
//        System.out.println("decelerate: " + this.currentSpeed);
    }

    public int drive() {
        double randomPercentage = Math.random();
        if (randomPercentage < 0.3) {
            this.decelerate();
        } else if (randomPercentage >= 0.3 && randomPercentage <= 0.8) {
            this.accelerate();
        }
        return this.distance += this.currentSpeed;
    }
}
/*
* not sure ar veikia maxspeed validacija;
 */
