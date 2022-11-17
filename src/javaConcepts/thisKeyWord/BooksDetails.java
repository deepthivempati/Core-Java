package javaConcepts.thisKeyWord;

public class BooksDetails {
    public static void main(String[] args) {
        BooksClass richDadPoorDad = new BooksClass();
        richDadPoorDad.setNoOfCopies(4000000);
        System.out.println(richDadPoorDad); // gives the address because richDadPoorDad is an object

        richDadPoorDad.setNoOfCopies(5000000);
        richDadPoorDad.getNoOfCopies(); // returns the changes data from 4M to 5M using getters and setters
    }

}
