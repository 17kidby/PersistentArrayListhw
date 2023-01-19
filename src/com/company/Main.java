package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        fileHandler file = new fileHandler();
        String user = "";
        ArrayList<String> PersistentArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Create new file?");
        user = input.nextLine();

        if (user.equals("yes")){
            file.createFile("New_file.txt");
        }

        System.out.println("Would you liek to input or receive from the file");
        







    }
}
