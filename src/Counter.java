import java.io.*;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {

        try (FileReader reader = new FileReader("string.txt")){
            int countOfWords = 0;

            Scanner scanner = new Scanner(reader);
            String string = scanner.nextLine();

            countOfWords = string.split(" ").length;
            System.out.println(countOfWords + " words");

            scanner.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
