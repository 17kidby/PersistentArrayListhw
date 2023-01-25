package com.company;

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


        System.out.println("Create new file?");
        user = input.nextLine();

        if (user.equals("yes")){
            file.createFile("New_file.txt");
        }

        System.out.println("What would you like to do with the file?");
        System.out.println("[1]: input");
        System.out.println("[2]: read");
        userInt = input.nextInt();

        if (userInt == 1){
            System.out.println("First, would you like to clear the file?");
            user = input.nextLine();
            if (user.equals("yes")){
                reset = true;
            }

            System.out.println("What would you like to input?");
            user = input.nextLine();
            inputList.add(user);
            file.writeToAdd("New_file.txt", inputList, reset);
            


        }





    }
}
