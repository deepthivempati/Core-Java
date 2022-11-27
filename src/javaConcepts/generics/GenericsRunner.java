package javaConcepts.generics;

public class GenericsRunner{

    public static void main(String[] args) {
        integerType();
        stringType();
    }
    private static void integerType() {
        MyList<Integer> list2 = new MyList<>();
        list2.addElementToList(6);
        list2.addElementToList(4);

        Integer number = list2.getIndex(1);
        System.out.println(number);
    }
    private static void stringType() {
        MyList<String> list1 = new MyList<>();
        list1.addElementToList("This is a String");
        list1.addElementToList("This is also a string");

        String s1 = list1.getIndex(1);
        System.out.println(s1);
    }
}

