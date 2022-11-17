package javaConcepts.ExceptionalHandling;

public class ThrowingCheckedExceptions {
    public static void main(String[] args) throws Exception {
        Asset Asset1 = new Asset("USD", 100);
        Asset Asset2 = new Asset("USD", 200); // gives 300(sum of 100,200)
        Asset Asset3 = new Asset("EUR", 300); // gives the thrown RuntimeException since the currencies did not match.
        Asset1.addAsset(Asset2);
        Asset1.addAsset(Asset3);
    }
}
class Asset {
    private String currency;
    private Integer asset;
    public Asset(String currency, Integer asset) {
        super();
        this.currency = currency;
        this.asset = asset;
    }
    public void addAsset(Asset other) throws Exception { //for Exception
        if (!this.currency.equals(other.currency)) {
            throw new Exception("Currencies dont match:" + " " + this.currency + " & " + other.currency); // since Exception is checked Exception need to throw or use try-catch to handle the exception
        }
        this.asset = (this.asset + other.asset);
        System.out.println(asset);
    }
}

