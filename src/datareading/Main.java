package datareading;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //FileReader fileReader;
        //FileReader fileReader = new FileReader("/Users/sajadakbar/Documents/develop/SeleniumJuly2019/singleton/src/datareading/sample.txt");
        //String fileName = "/Users/sajadakbar/Documents/develop/SeleniumJuly2019/singleton/src/datareading/sample.txt";
        //FileReader fileReader = new FileReader(fileName);
        //BufferedReader bufferedReader;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{String fileName = "/Users/sajadakbar/Documents/develop/SeleniumJuly2019/singleton/src/datareading/sample.txt";
            fileReader = new FileReader(fileName);
            //BufferedReader bufferedReader;
            bufferedReader = new BufferedReader(fileReader);
            String data = "";
            while ((data = bufferedReader.readLine()) != null){
                System.out.println(data);
            }

    } catch (FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println("Invalid file name, please enter a valid file");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("10 error");
        } finally {
            bufferedReader.close();
            fileReader.close();

        }

        }


}
