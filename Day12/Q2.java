package Day12;

public class Q2 {

    public static void main(String[] args) {

        Robot[] fleet = {
            new DroneRobot("D-1", 20.0),
            new GroundRobot("G-5", 10.0),
            new DroneRobot("D-2", 10.0)
        };

        for (Robot r : fleet) {
            r.performTask();
            r.reportStatus();
        }
    }
}

abstract class Robot {
    private String batteryId;
    protected double chargeLevel;

    public Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void reportStatus() {
        System.out.println("Robot ID: " + batteryId + ", Charge: " + chargeLevel + "%");
    }

    public abstract void performTask();

    protected void work(double consumption) {
        if (chargeLevel < consumption) {
            System.out.println("Low battery!");
        } else {
            chargeLevel -= consumption;
            if (chargeLevel < 0) {
                chargeLevel = 0;
            }
        }
    }
}

class DroneRobot extends Robot {

    public DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        System.out.println("Drone moving at 2x speed...");
        work(15);
    }
}

class GroundRobot extends Robot {

    public GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        System.out.println("Performing surface check...");
        work(5);
    }
}
