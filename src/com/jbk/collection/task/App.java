package jbk.collection.task;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
	public static void main(String[] args) {

		City city1 = new City(121, "Ajmer");
		City city3 = new City(123, "Bharatpur");
		City city4 = new City(124, "Beawer");
		City city5 = new City(125, "Agra");
		City city6 = new City(126, "Pune");
		City city7 = new City(127, "Jodhpur");
		City city8 = new City(128, "Bilara");
		City city9 = new City(129, "Mathura");
		City city10 = new City(130, "Goverdhan");
		City city11 = new City(131, "Deeg");
		City city12 = new City(132, "Fatehpur Sikri");
		City city13 = new City(133, "Pali");
		City city14 = new City(134, "Sadari");
		City city15 = new City(135, "Falna");

		ArrayList<City> cities = new ArrayList<>();
		cities.add(city1);
		cities.add(city4);
		Dist dist1 = new Dist(1, "Ajmer", cities);

		ArrayList<City> cities2 = new ArrayList<>();
		cities2.add(city13);
		cities2.add(city14);
		cities2.add(city15);
		Dist dist2 = new Dist(2, "Pali", cities2);


// 		adding dist to state
		ArrayList<Dist> allRajDist = new ArrayList<>();
		allRajDist.add(dist1);
		allRajDist.add(dist2);
		
		
		HashMap<String,ArrayList<Dist>> state1 =new HashMap<>();
		state1.put("Rajasthan", allRajDist);
		State raj = new State(444,"Rajasthan",state1);
		
		
		
		HashMap<String,HashMap<String,State>> states = new HashMap<>();
//		states.put("rajasthan", state1);
		
		Country country = new Country(999,"India",states);
		System.out.println(country);
		
		
	}
}