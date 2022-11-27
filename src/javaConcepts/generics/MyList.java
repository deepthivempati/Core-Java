package javaConcepts.generics;

import java.util.ArrayList;
public class MyList<T> { // public class MyList<T extends Number> this will not accept string type or any other than anaumber and its subtypes such as : int, long, float, double etc.
    ArrayList<T> list = new ArrayList<>(); // ArrayList accepts the type T which is generic that accepts any datatype instead of specific one like only String or only Integer
    public void addElementToList(T element) { //The parameter of T of the method addElementToList accepts String, Integer, Float etc. same method diff type args it accepts
        list.add(element);
    }
    public T getIndex(int i){
        return list.get(i);
    }
}
