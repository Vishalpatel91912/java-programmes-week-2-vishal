package javaprogrammes_week2_vishal;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static method inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the main method and run the programme.
 */
public class Programme_3_Instance_Static_Variable {
    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Programme_3_Instance_Static_Variable.surname);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod(){
        Programme_3_Instance_Static_Variable programme3 = new Programme_3_Instance_Static_Variable();
        System.out.println(surname);
    }
    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_3_Instance_Static_Variable programme_3 =new Programme_3_Instance_Static_Variable();
        programme_3.instanceMethod();
    }
}
