package fr.utbm.core.entity;

import java.util.Set;

public class Area {

	private int id;
	private String label;
	private String road; // Peut être null
	private Set<Station> stations;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the road
	 */
	public String getRoad() {
		return road;
	}

	/**
	 * @param road
	 *            the road to set
	 */
	public void setRoad(String road) {
		this.road = road;
	}

	/**
	 * @return the stations
	 */
	public Set<Station> getStations() {
		return stations;
	}

	/**
	 * @param stations
	 *            the stations to set
	 */
	public void setStations(Set<Station> stations) {
		this.stations = stations;
	}

}
