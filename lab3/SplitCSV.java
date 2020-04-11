package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class SplitCSV
{
    public static void main(String[] args)
    {
        String fileToParse = "src/main/java/org/example/input.csv";
        BufferedReader fileReader = null;
         
        try
        {
            String line = "";
           
            fileReader = new BufferedReader(new FileReader(fileToParse));
             
          
            while ((line = fileReader.readLine()) != null) 
            {
                
                String[] tokens = line.split(",");
                for(String token : tokens)
                {
                    System.out.println(token);
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}