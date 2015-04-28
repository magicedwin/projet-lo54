package fr.utbm.core.entity;

import java.util.Set;

public class Sensor {

	private int id;
	private String label;
	private Station station;
	private Set<Temperature> temperatures;

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
	 * @return the station
	 */
	public Station getStation() {
		return station;
	}

	/**
	 * @param station
	 *            the station to set
	 */
	public void setStation(Station station) {
		this.station = station;
	}

	/**
	 * @return the temperatures
	 */
	public Set<Temperature> getTemperatures() {
		return temperatures;
	}

	/**
	 * @param temperatures
	 *            the temperatures to set
	 */
	public void setTemperatures(Set<Temperature> temperatures) {
		this.temperatures = temperatures;
	}

}
