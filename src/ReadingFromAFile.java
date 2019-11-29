import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args)
    {
        //write some info to a file
        try
    {
        Formatter outputFile = new Formatter("outputFile.txt");
        outputFile.format("All I want for Christmas is: \n");
        outputFile.format("golf simulator\n");
        outputFile.format("new boat\n");
        outputFile.format("Canon 5D mark IV\n");
        outputFile.close();
    }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("outputFile.txt");
        readFromFile(file);
    }

    /**
     * This method will read the file sent to it (Assumes it is a basic text file)
     * and display the contents to the console
     */
    public static void readFromFile(File fileToRead)  {
        try {
            Scanner fileReader = new Scanner(fileToRead);

            while(fileReader.hasNext())
            {
                System.out.println(fileReader.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Sorry that file does not exist");;
        }

    }


}
