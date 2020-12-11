package tsppso01;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[]args) {
        ArrayList<City> cities = new ArrayList<City>();
        try{
        	String url = "C:\\Users\\Admin\\Desktop\\tspcode.txt";
            FileInputStream fileinputstream =  new FileInputStream(url);
            Scanner scan2 = new Scanner(fileinputstream);	         
            while (scan2.hasNextLine()) {
            	String line = scan2.nextLine();
                String[] line_array = line.split(" ");
                City city = new City(Double.parseDouble(line_array[0]), Double.parseDouble(line_array[1]), line_array[2] );
                cities.add(city);
             }
        }catch (Exception e)
        {
            System.out.println("Error : "+e.getMessage() +" !");
        }
        
        Route route = new Route(cities);
        PSOAlgorithm pso = new PSOAlgorithm(route);     
        pso.findShortestRoute();
      
       
    }
}
