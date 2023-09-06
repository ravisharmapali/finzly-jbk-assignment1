package jbk.collection.task;

import java.util.HashMap;

public class Country {
	private int countryId;
	private String countryName;

	private HashMap<String, HashMap<String, State>> states = new HashMap<>();

	public Country() {

	}

	public Country(int countryId, String countryName, HashMap<String, HashMap<String, State>> states) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.states = states;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", states=" + states + "]";
	}

}