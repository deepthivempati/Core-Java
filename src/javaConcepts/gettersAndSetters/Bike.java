package javaConcepts.gettersAndSetters;

public class Bike{
    private int speed; //getters and setters can be created by rightclick -> generate -> generate getters and setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>0)
        this.speed = speed;
    }
}
