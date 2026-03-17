package multi_threadeing; // Changed package name for convention

/**
 * The Data class contains the shared resource (the disp method).
 * The 'synchronized' keyword on the disp method ensures that only
 * one thread can execute this method on a 'data' object at a time.
 * This prevents race conditions when multiple threads try to print.
 */
class Data { // Renamed 'data' to 'Data' for Java class naming convention

    // Synchronized method to display a string character by character
    // Only one thread can execute this method on a given Data object at a time
    synchronized public void disp(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            // You can add a small delay here to make the effect of synchronization
            // or lack thereof more visible if you remove 'synchronized' later.
            // try { Thread.sleep(10); } catch (InterruptedException e) {}
        }
    }
}

/**
 * Thread1 class extends Thread and prints a specific message.
 */
class Thread1 extends Thread { // Renamed 'thread1' to 'Thread1' for Java class naming convention

    Data d; // Reference to the shared Data object

    public Thread1(Data d) {
        this.d = d;
    }

    @Override // Good practice to use @Override annotation
    public void run() {
        d.disp("hello abbas"); // Calls the synchronized method on the shared Data object
    }
}

/**
 * Thread2 class extends Thread and prints another specific message.
 */
class Thread2 extends Thread { // Renamed 'thread2' to 'Thread2' for Java class naming convention

    Data d; // Reference to the shared Data object

    public Thread2(Data d) {
        this.d = d;
    }

    @Override // Good practice to use @Override annotation
    public void run() {
        d.disp("welcome to the world off death"); // Calls the synchronized method on the shared Data object
    }
}

/**
 * Main class to demonstrate thread synchronization.
 * It creates two threads that share a single Data object.
 */
public class synchronization { // Renamed 'syncronization' to 'Synchronization' for Java class naming convention

    public static void main(String[] args) { // Conventionally 'args' instead of 'str' for main method arguments

        // Create a single Data object to be shared by both threads
        Data sharedData = new Data();

        // Create instances of Thread1 and Thread2, passing the same shared Data object
        Thread1 th1 = new Thread1(sharedData);
        Thread2 th2 = new Thread2(sharedData);

        // Start both threads
        // The JVM will call the run() method of each thread
        th1.start();
        th2.start();

        // Output will be: one string completely printed, then the other completely printed.
        // The order (which string comes first) is not guaranteed due to thread scheduling.
    }
}