package javaConcepts.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsExample1 {
    public static <T> T value(T value) {
        return value;
    }
    public static <T extends List> void similar(T list) {
        //list.addAll(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        String string = value(new String("abc"));
        Integer integer = value(Integer.valueOf(100));
        ArrayList al = value(new ArrayList<>(List.of(1, 2, 3)));

        ArrayList finalList = new ArrayList<>();
        finalList.add(string);
        finalList.add(integer);
        finalList.add(al);
        System.out.println(value(finalList));

        LinkedList l1 = new LinkedList<>(List.of(7, 8, 9)); // LinkedList is the child class of List
        similar(l1);
    }
}