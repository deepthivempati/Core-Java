package Loops;
// The system will verify the given condition, If the given condition is true, the system will execute the logic in the while block then the system moves the controll to given condition. These process will be repeated untill the given condition is false.
// we can place the logic only inside while loop, we can repeat the execution of logic n no of times, until given condition is false.
// The logic in if block will be executed only when the given condition is true, where as the logic in the while block will be executed when false.
public class WhileLoop {
    public static void main(String[] args) {
        int a = 1;
        while(a<=6)
        {
            System.out.println(a);
            a++;
        }
        System.out.println("sleeping");
    }
}
