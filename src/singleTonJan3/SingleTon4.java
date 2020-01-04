package singleTonJan3;

public class SingleTon4 {
    // We need only 3 steps
     // 1st to create private constructor
    // 2nd create instance of the Singleton Class
    // provide Global access point to get Access

    private int nubmer = 20;
    private String name = "Sajad";

    private SingleTon4() {
        this.nubmer = nubmer;
        this.name = name;

    }

    // How to create instance
    private static SingleTon4 instance = new SingleTon4();


    public static SingleTon4 getInstance(){
        return instance;
    }

    public int getNubmer() {
        return nubmer;
    }

    public String getName() {
        return name;
    }

    public void setNubmer(int nubmer) {
        this.nubmer = nubmer;
    }

    public void setName(String name) {
        this.name = name;
    }
}
