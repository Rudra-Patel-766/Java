package Day12;
abstract class Plan {
    private String patientName;
    private double baseFee;

    public Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public abstract double calculateBill();
}

class SilverPlan extends Plan {
    public SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    public double calculateBill() {
        return getBaseFee() + 15.0;
    }
}

class GoldPlan extends Plan {
    public GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    public double calculateBill() {
        double surcharge = 0.10 * getBaseFee();
        double discount = 20.0;
        return getBaseFee() + surcharge - discount;
    }
}

public class Q1 {
    public static void printInvoice(Plan p) {
        System.out.println("Patient: " + p.getPatientName());
        System.out.println("Total Bill: $" + p.calculateBill());
    }

    public static void main(String[] args) {
        Plan p1 = new SilverPlan("John", 100.0);
        Plan p2 = new GoldPlan("Sophia", 200.0);
        Plan p3 = new GoldPlan("Max", 50.0);

        printInvoice(p1);
        printInvoice(p2);
        printInvoice(p3);
    }
}