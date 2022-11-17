package javaConcepts.ExceptionalHandling;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException {
        try {
            someMethod();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException with try catch");
            ex.printStackTrace();
        }
    }

    private static void someMethod() throws InterruptedException {
        Thread.sleep(2000);  // code does not do anything for 2 secs. without Handling exception it gives us compile time error.
        System.out.println("InterruptedException with throws");
    }
}

// A checked exception is caught at compile time. A Runtime or unchecked exception is caught at runtime.
// A checked exception must be handled either by re-throwing or with a try catch block, whereas an unchecked isn't required to be handled.
