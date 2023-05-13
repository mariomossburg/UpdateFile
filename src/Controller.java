import java.io.*;
import java.util.Scanner;

//A basic program that takes a file you create and the text, updates it then deletes the original file.
//The new updated file will move each sentence to a new line and omit the period

public class Controller {
    public static void main(String[] args) throws IOException{

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a file: ");
        String fileName = keyboard.nextLine();
        File originalFile = new File(fileName);
        File updatedFile = new File("updatedFile.txt");

        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(originalFile));
            PrintWriter newFile = new PrintWriter(new FileOutputStream(updatedFile));

            System.out.println("please write or copy and paste a short story: ");

            String inputText = keyboard.nextLine();
            String finishedFile = inputText.replaceAll("\\.\\s*", "\n");

            writer.println(inputText);
            newFile.println(finishedFile);

            writer.close();
            newFile.close();
        }
        catch (IOException e){
            System.out.println("check");
            System.exit(0);
        }
        //the line below deletes the original file to only leave updated .txt file
        originalFile.delete();

    }//end main
}//end class

