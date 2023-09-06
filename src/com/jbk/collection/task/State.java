package jbk.collection.task;

import java.util.ArrayList;
import java.util.HashMap;

public class State {
	private int stateId;
	private String stateName;
	private HashMap<String, ArrayList<Dist>> dists = new HashMap<>();

	public State() {

	}

	public State(int stateId, String stateName, HashMap<String, ArrayList<Dist>> dists) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.dists = dists;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public HashMap<String, ArrayList<Dist>> getDists() {
		return dists;
	}

	public void setDists(HashMap<String, ArrayList<Dist>> dists) {
		this.dists = dists;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", dists=" + dists + "]";
	}

}
