import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("string.txt")){
            LineNumberReader lineNumberReader = new LineNumberReader(reader);
            int countOfWords, i = 0;
            ArrayList<String> arrayList = new ArrayList<>();

            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine())
            {
                arrayList.add(scanner.nextLine());
                countOfWords = arrayList.get(i).split("\\s+").length;
                //System.out.print(arrayList.get(i)+"\t\t");
                if (i==0)
                    System.out.println(countOfWords + " words");
                else System.out.println();
                i++;
            }
            reader.close();
            scanner.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
