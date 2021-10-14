package com.company;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to CompanyLocker PVT.Ltd");
        Scanner sc = new Scanner(System.in);
        String value = null;
        String label= null;
        do {
            System.out.println("Enter the operation for files");
            System.out.println("Enter 1 for Adding file");
            System.out.println("Enter 2 for Deleting File");
            System.out.println("Enter 3 for Searching File");
            System.out.println("Enter 4 for showing List of files added");

            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("wrong choice entered \n" + e);
            }

            switch (choice) {

                case 1: {
                    System.out.println("Enter the name of the file to be added");
                    String fileName = sc.next();
                    File obj = new File(fileName);
                    if (obj.exists()) {
                        System.out.println("File already exists");}
                    else{
                    try {
                        obj.createNewFile();
                        System.out.println("File Created  " + obj.getName());
                    } catch (IOException e) {
                        System.out.println("some error while creating file");
                        e.printStackTrace();
                    }}
                    break;
                }
                case 2: {
                    System.out.println("Enter the file name to be deleted ");
                    String fileName = sc.next();
                    File obj = new File(fileName);
                    if(obj.exists()){
                        obj.delete();
                        System.out.println("File Deleted "+ obj.getName());
                    }else
                    {
                        System.out.println("File not found not deleted");
                    }
                  //  if (obj.delete()) {
                  //      System.out.println("File Deleted  " + obj.getName());
                  //  } else System.out.println("File not deleted");
                    break;
                }
                case 3: {
                    System.out.println("Enter the name of the file for searching");
                    String fileName = sc.next();
                    File obj = new File(fileName);
                    if (obj.exists()) {
                        System.out.println("File is available  " + obj.getName());
                        System.out.println("path is" + obj.getAbsolutePath());
                    } else {
                        System.out.println("File not found");

                    }
                    break;
                }
                case 4: {
                    try {

                        // Create a file object
                        File f = new File("F:\\java\\Simplilearn");

                        // Get all the names of the files present
                        // in the given directory
                        String[] files = f.list();

                        System.out.println("Files are:");

                        // Display the names of the files
                        for (int i = 0; i < files.length; i++) {
                            System.out.println(files[i]);
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }

                default: {
                    System.out.println("wrong choice entered");
                    System.out.println("Enter the operation for files");
                    System.out.println("Enter 1 for Adding file");
                    System.out.println("Enter 2 for Deleting File");
                    System.out.println("Enter 3 for Searching File");
                    System.out.println("Enter 4 for showing List of files added");
                    choice = sc.nextInt();
                   continue ;
                }


            }

                System.out.println("Do you want to continue(y/n)");
                value = sc.next();


        }
        while (value.equals("y"));
        System.out.println("Thank You");
        System.out.println("Exit from the application");

    }
}
