package javaConcepts.thisKeyWord;

public class BooksClass {
    private int noOfCopies; //cannot be private if this member var is inside setNoOfCopies method(gives compilation err)

    void setNoOfCopies(int copies) { //copies is local var
        this.noOfCopies = copies; // noOfCopies is mem var which takes the value of local var copies. because we cannot use mem var inside other class a so declaring that var as private in this class and making it accessible to another class through a method which satisfies encapsulation.
        System.out.println(noOfCopies); // gives the data because noOfCopies is a var that stores the data.
    }

    int getNoOfCopies() {
        return this.noOfCopies; // returns 5M which we set manually.
    }
}

