package com.company.UserInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithCSVFile {
    public void showAllProductCSV(){
        String file = "src\\Products.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                //use this if your values already contain commas
                for(String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
