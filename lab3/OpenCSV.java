package org.example;

import java.io.FileReader;
import java.io.IOException;
 
import au.com.bytecode.opencsv.CSVReader;
 
public class OpenCSV {
     
    public static void main(String[] args) 
    {
        CSVReader reader = null;
        try
        {
            
            reader = new CSVReader(new FileReader("src/main/java/org/example/input.csv"),',');
            String [] nextLine;
           
            while ((nextLine = reader.readNext()) != null) 
            {
                for(String token : nextLine)
                {
                    //Печатаем все строки
                    System.out.println(token);
                }
            }
        }
        catch (Exception e) {
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
