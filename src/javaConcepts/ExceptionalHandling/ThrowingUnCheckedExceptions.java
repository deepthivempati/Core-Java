package javaConcepts.ExceptionalHandling;

public class ThrowingUnCheckedExceptions {
    public static void main(String[] args) {
        Amount amount1 = new Amount("USD", 100);
        Amount amount2 = new Amount("USD", 200); // gives 300(sum of 100,200)
        Amount amount3 = new Amount("EUR", 300); // gives the thrown RuntimeException since the currencies did not match.
        amount1.addAmount(amount2);
        amount1.addAmount(amount3);
    }
}

class Amount {
    private String currency;
    private Integer amount;

    public Amount(String currency, Integer amount) { // constructors are created for the class Amount
        super(); // The super keyword in Java is a reference variable which is used to refer immediate parent class object.
        this.currency = currency;
        this.amount = amount;
    }

    public void addAmount(Amount other) {
        //public void addAmount(Amount other) throws Exception { //for Exception
        if (!this.currency.equals(other.currency)) {
            throw new RuntimeException("Currencies dont match");
        }
           /* if(!this.currency.equals(other.currency)){
                throw new Exception("Currencies dont match"); // since Exception is checked Exception need to throw or use try-catch to handle the exception
            }*/
        this.amount = (this.amount + other.amount);
        //this.amount = Integer.valueOf((this.amount + " " + other.amount)); // gives NumberFormatException(unchecked exception) because attempt is made to convert a string (" ") with an incorrect format to a numeric value. cannot convert " " to number.
        System.out.println(amount);
    }
}

// Integer.valueOf is inbuilt method which is used to return an Integer instance representing the specified int value.

