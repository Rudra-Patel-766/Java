package Scenario_Based_Question;

class CountdownThread extends Thread {

    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Count: " + i);
                Thread.sleep(1000); 
            }
            System.out.println("Countdown Finished");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        CountdownThread t1 = new CountdownThread();
        t1.start(); 
    }
}
