public class Eat {
    void junkFood(){
        System.out.println("No junkFood!");
    }
    public static void main(String[] args) {
        Eat junk = new Eat();
        junk.junkFood();
    }
}

// cannot call Eat.junkFood since non-static methods cannot be referred from static
// so object of the class is created and call the non-static method(ex: Eat)