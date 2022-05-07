import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("/Users/velal/OneDrive/Desktop/file1.txt");
            myWriter.write("Java is a prominent programming language os the millenium");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
