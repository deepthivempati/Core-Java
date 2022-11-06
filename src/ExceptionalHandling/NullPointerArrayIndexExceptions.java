package ExceptionalHandling;

public class NullPointerArrayIndexExceptions {
    public static void main(String[] args) {
        exception1();
        System.out.println("main ended"); // since we are handling exception main method will be executed here.
    }

    private static void exception1() {
        try {
            /*String str = null;
            str.stripLeading(); //removes all the whitespaces only at the starting of the string.
*/
            int[] i = {6,9};
            int number = i[2];

            System.out.println("exception1 ended");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBound Exception");
        }
        catch (NullPointerException ex) {
            System.out.println("Null PointerException");
        }
        catch (Exception ex) { // Exception class and its subclasses are a form of {@code Throwable} that indicates conditions that are responsible for application might want to catch.
        ex.printStackTrace(); //prints entire stack as an output
        }
        finally {// irrespective of try catch code or exceptions finally block executes. finally block does not execute when logic inside finally throws an exception and when the jvm crashes in the catch block
             System.out.println("Handling Exceptions is important");
        }
    }
}
// respective catch block will be executed based on relevant exception.
// NullPointerException extends RunTimeException which extends Exception.
// ArrayIndexOutOfBoundException extends IndexOutOfBoundException extends RunTimeException extends Exception.
// if the exception is handled then the methods its calling will not know the exception like exception1 is handling the exception main method is executed without any exception.
// finally block can be with try block without catch block.