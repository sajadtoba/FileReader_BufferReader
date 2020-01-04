package singleTonJan3;

public class TestSingleton {
    public static void main(String[] args) {
        //SingleTon4.getInstance // I am unable to get the method instance because I need to generate the Getter Method

        //SingleTon4.getInstance();
        SingleTon4 obj1 = SingleTon4.getInstance();
        System.out.println("The value is     " + obj1.getName() + "and also the Number           " + obj1.getNubmer());

        // I want to change the number or any value then what should i do
        // In this case I will generate the setter method to set the value I want by myself.
        // after I set the value then i can print out by using the same created object or reference Variable for the class
        // To generate the setter we need to go the class outside of the Main Method

        obj1.setNubmer(2);
        //obj1.setName("Jamal uddin");
        System.out.println("The value is                  " + obj1.getName() + "and also the Number           " + obj1.getNubmer());
        SingleTon4 obj2 = SingleTon4.getInstance();
        //obj2.setName("Love");
        //obj.setNubmer(98);
        System.out.println("The value is     " + obj2.getName() + "and also the Number           " + obj2.getNubmer());

    }

}
