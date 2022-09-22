import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/velal/OneDrive/Desktop/captmidn.txt");
        Scanner sc = new Scanner(file);

        //to print the content of the file
/*        while(sc.hasNextLine())
            System.out.println(sc.nextLine());*/

        String fileContent = "This is a new file made by Niketh." + "\n";
        while (sc.hasNextLine()) {
            fileContent = fileContent.concat(sc.nextLine() + "\n");
        }

        //to write the contents of captmidn file to newfile
        FileWriter writer = new FileWriter("/Users/velal/OneDrive/Desktop/newfile.txt");
        writer.write(fileContent);
        //to close the file writer
        writer.close();
    }
}

