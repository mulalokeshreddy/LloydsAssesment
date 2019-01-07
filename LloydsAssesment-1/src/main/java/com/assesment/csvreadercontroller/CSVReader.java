package com.assesment.csvreadercontroller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "D://data.csv"; //we have to place the csv file in that particular location
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null)  {
                String[] details = line.split(cvsSplitBy);
                System.out.println("Details=== [ID="+details[0]+ ", Name="+details[1]+", DoubleValue=" + details[2] + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}