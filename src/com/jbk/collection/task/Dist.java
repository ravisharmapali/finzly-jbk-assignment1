package jbk.collection.task;

import java.util.ArrayList;

public class Dist {
	private int distId;
	private String distName;

	private ArrayList<City> cities = new ArrayList<>();
	
	public Dist() {

	}

	public Dist(int distId, String distName, ArrayList<City> cities) {

		this.distId = distId;
		this.distName = distName;
		this.cities = cities;
	}

	public int getDistId() {
		return distId;
	}

	public void setDistId(int distId) {
		this.distId = distId;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Dist [distId=" + distId + ", DistName=" + distName + ", cities=" + cities + "]";
	}

}
