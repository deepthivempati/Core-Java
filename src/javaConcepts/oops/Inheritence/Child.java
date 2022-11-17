package javaConcepts.oops.Inheritence;

public class Child extends Parent {
    private Float floatVal;

    public Child(Float floatVal) {
        this.floatVal = floatVal;
    }

    public Child(String str, Integer intValue, Model model, Float floatVal) {
        super(str, intValue, model); // super() keyword calls parentclass methods, and to access the parentclass constructor. The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
        this.floatVal = floatVal; // this() keyword calls currentclass instance variables.
    }

    public Child() {
        super();
    }

    public Float getFloatVal() {
        return floatVal;
    }

    public void setFloatVal(Float floatVal) {
        this.floatVal = floatVal;
    }
}
