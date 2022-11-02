package Loops;

public class DowhileLoop {
    public static void main(String[] args) {
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while(a<10);
        System.out.println("sleeping");
    }
}
// The System will execute the logic in do while block, then the system will verify the given condition, if true system will repeat the execution of logic untill the given condition is false.
// the logic in do while block will be executed atleast once even if the logic condition is false
// Difference between if and while and do while --> if block executes 0 or 1 time, while block executes 0 or more times, whereas while block executes 1 or more times.