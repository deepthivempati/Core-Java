package oops.inheritence;

public class Parent {
    private String str;
    private Integer intValue;
    private Model model;

    public Parent() { // no args constructor. parent class should always contain no args constructor
    }

    public Parent(String str, Integer intValue, Model model) {
        this.str = str;
        this.intValue = intValue;
        this.model = model;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
// Constructors are methods that are automatically executed every time you create an object. The purpose of a constructor is to construct an object and assign values to the object's members.