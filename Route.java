package tsppso01;

import java.util.ArrayList;
import java.util.Collections;

public class Route {
	public ArrayList<City> cities = new ArrayList<City>();

   
    public Route(ArrayList<City> cities)
    {
        this.cities.addAll(cities);
        Collections.shuffle(this.cities);
    }

    public Route(Route route){
        for(int i = 0 ; i< route.cities.size() ; i++)
        {
            cities.add(route.cities.get(i));
        }
    }

    public double getFullRouteDistance()
    {
        double fullDistance = 0;
        for (int i = 0 ; i < cities.size();i++)
        {
            if (i+1==cities.size()){
                fullDistance+=cities.get(i-1).distanceTo(cities.get(i));
            }else{
                fullDistance+=cities.get(i).distanceTo(cities.get(i+1));
            }
        }
        fullDistance+=cities.get(cities.size()-1).distanceTo(cities.get(0));
        return fullDistance;
    }

    public String printRoute()
    {
        String str = "";
        str+="{ ";
        for (City city:cities) {
            str+=city.name+" ";
        }
        str+=" }";
        return str;
    }
}
