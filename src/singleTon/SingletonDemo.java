package singleTon;

public class SingletonDemo {
    private int number;
    private String name;

    private SingletonDemo(){
        this.number = 10;
        this.name = "Singleton name";
    }
    private static SingletonDemo instnce = new SingletonDemo();

    public static SingletonDemo getInstance() {
        return instnce;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
