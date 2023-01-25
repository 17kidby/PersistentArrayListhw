import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        fileHandler file = new fileHandler();
        String user = "";
        int userInt = 0;
        ArrayList<String> PersistentArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean reset = false;


        

        System.out.println("New file?    1: yes or 2: no");
        userInt = input.nextInt();
        if (userInt ==1){
          file.createFile("New_file.txt");

        }
        
        

        System.out.println("What would you like to do with the file?");
        System.out.println("[1]: input");
        System.out.println("[2]: read");
        userInt = input.nextInt();

      
        if (userInt == 1){
            user = input.nextLine();
          
            System.out.println("What would you like to input?");
            user = input.nextLine();
            
            file.writeToAdd("New_file.txt", user, reset);
            
        }else if (userInt == 2){
          
          System.out.println("Would you like to read one line or the whole file?");
          System.out.println("[1] one line");
          System.out.println("[2] whole thing");
          userInt = input.nextInt();

          if (userInt == 1){
            System.out.println("Please input what line of the file you would like to read");
            userInt = input.nextInt();
            file.readOneLine("New_file.txt", userInt);

            
          }
        }
      





    }
}
