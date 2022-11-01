package NumberMultiplication;

public class Multiplication {
    int i;

    void print() {
        for (i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }
    // println does not return void so printf is been used instead

    public void print(int table) {
        for (i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
    // print method is overidden(same method diff parameters) for dynamic multiplication with one param inside method

    public void print(int table, int from, int to) {
        for (i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
}
