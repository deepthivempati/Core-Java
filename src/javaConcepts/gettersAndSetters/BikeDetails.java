package javaConcepts.gettersAndSetters;

public class BikeDetails {
    public static void main(String[] args) {
        Bike duke = new Bike();
        Bike ktm = new Bike();
        duke.setSpeed(80);
        System.out.println(duke.getSpeed());
        ktm.setSpeed(-70);
        System.out.println(ktm.getSpeed()); //gives int default value 0 since it did not satisfy the condition.
    }
}
