package javaConcepts.exceptionalHandling;

public class ThrowingCustomException {
    public static void main(String[] args) throws Exception {
        Money Money1 = new Money("USD", 100);
        Money Money3 = new Money("EUR", 300); // gives the thrown RuntimeException since the currencies did not match.
        Money1.addMoney(Money3);
    }
}

class CustomException extends Exception { //// if we use Runtime Ex instead of Exception we dont have use Throws because Runtime ex is unchecked ex.
    CustomException(String message) {
        super(message);
    }
}

class Money {
    private String currency;
    private Integer money;

    public Money(String currency, Integer money) {
        super();
        this.currency = currency;
        this.money = money;
    }
    public void addMoney(Money other) throws CustomException { //for Exception
        if (!this.currency.equals(other.currency)) {
            throw new CustomException("Currencies dont match:" + " " + this.currency + " & " + other.currency);
        }
        this.money = (this.money + other.money);
        System.out.println(money);
    }
}

