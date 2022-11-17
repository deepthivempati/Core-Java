package javaConcepts;

public class VariableReAssignment {
        String name = "Deepthi";
        String Area = "Maripeda Banglow";

        public static void main(String[] args) {
            VariableReAssignment data = new VariableReAssignment();
            String name =  data.name = "Deepthi";
            String area =  data.Area= "Maripeda Banglow";
            System.out.println(name);
            System.out.println(area);
        }
    }

   // data variable is of Object type(VariableReAssignment). Object can hold multiple variables so name and area are both stored in data variable which is of object type VariableReAssignment.
