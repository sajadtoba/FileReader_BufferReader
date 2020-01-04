package singleTon;

public class Main {

    public static void main(String[] args) {
        //SingletonDemo singletonDemo = new SingletonDemo();
        //SingletonDemo.getInstance();
        SingletonDemo obj1 = SingletonDemo.getInstance();
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getName());
        obj1.setNumber(20);
        System.out.println("The new value                                    "+obj1.getNumber());

        SingletonDemo obj2 = SingletonDemo.getInstance();
        System.out.println("The object 2 value look and compare the 1st one          "         +obj2.getName());
        System.out.println("The object 2 number                                      "             +obj2.getNumber());


        SingletonDemo obj3 = SingletonDemo.getInstance();
        System.out.println("The object 3 value                  "+obj3.getNumber());
        System.out.println("The new name                         "+obj3.getNumber());

    }
}
